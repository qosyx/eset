/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.eset.eset.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.eset.eset.entities.Etudiant;
import org.eset.eset.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author archange
 */
@RestController
//@RequestMapping("/etudiant")
public class EtudiantRestService {

    @Autowired
    private EtudiantRepository etudiantRepository;

    @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_PROF')") 
    @RequestMapping(value = "/etudiants", method = RequestMethod.POST)
    public Etudiant save(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_PROF')") 
    @RequestMapping(value = "/etudiants", method = RequestMethod.GET)
    public List<Etudiant> getAll() {
        List<Etudiant> etudiants = new ArrayList<Etudiant>();
        etudiants = etudiantRepository.findAll();
        return etudiants;
    }

    @PreAuthorize("hasRole('ROLE_PROF')")
    @RequestMapping(value = "/listetudiants", method = RequestMethod.GET)
    public Page<Etudiant> lisEtudiants(int page, int size) {

        return etudiantRepository.findAll(new PageRequest(page, size));
    }

    @RequestMapping(value = "/getLogedUser")
    public Map<String, Object> getLogedUser(HttpServletRequest httpServletRequest) {
        HttpSession httpSession = httpServletRequest.getSession();
        SecurityContext securityContext = (SecurityContext) httpSession.getAttribute("SPRING_SECURITY_CONTEXT");
        String username = securityContext.getAuthentication().getName();
        List<String> roles = new ArrayList<>();
        for (GrantedAuthority ga : securityContext.getAuthentication().getAuthorities()) {
            roles.add(ga.getAuthority());

        }
        Map<String, Object> params = new HashMap();
        params.put("username", username);
        params.put("roles", roles);
        return params;
    }
}
