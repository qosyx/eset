/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.eset.eset.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author archange
 */
@Controller
//@CrossOrigin("*")
public class EtudiantController {
    @RequestMapping("/login")
    public String login(){
    return "login";
    }
    
}
