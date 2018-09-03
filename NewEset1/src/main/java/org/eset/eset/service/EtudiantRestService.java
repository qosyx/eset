/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.eset.eset.service;

import java.util.ArrayList;
import static java.util.Arrays.sort;
import java.util.List;
import org.eset.eset.entities.Etudiant;
import org.eset.eset.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.access.annotation.Secured;
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

    @RequestMapping(value = "/etudiants", method = RequestMethod.POST)
    public Etudiant save(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Secured(value = ("ADMIN"))
    @RequestMapping(value = "/etudiants", method = RequestMethod.GET)
    public List<Etudiant> getAll() {
        List<Etudiant> etudiants = new ArrayList<Etudiant>();
        etudiants = etudiantRepository.findAll();
        return etudiants;
    }

    @RequestMapping(value = "/listetudiants", method = RequestMethod.GET)
    public Page<Etudiant> lisEtudiants(int page, int size) {

        return etudiantRepository.findAll(new PageRequest(page, size));
    }
}
