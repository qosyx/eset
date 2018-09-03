/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.eset.eset.repository;

import java.io.Serializable;
import org.eset.eset.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author archange
 */
public interface EtudiantRepository extends JpaRepository<Etudiant ,Long>{
    
}
