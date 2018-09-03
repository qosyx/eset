/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.MongoStation.retour;

import bl.entity.Erreurs;

/**
 *
 * @author Christian
 */
public class RetourSupprimerStation {

    private int codeTraitement;
    private Erreurs erreurs;

    /**
     * @return the codeTraitement
     */
    public int getCodeTraitement() {
        return codeTraitement;
    }

    /**
     * @param codeTraitement the codeTraitement to set
     */
    public void setCodeTraitement(int codeTraitement) {
        this.codeTraitement = codeTraitement;
    }

    /**
     * @return the erreurs
     */
    public Erreurs getErreurs() {
        return erreurs;
    }

    /**
     * @param Erreurs the erreurs to set
     */
    public void setErreurs(Erreurs Erreurs) {
        this.erreurs = Erreurs;
    }

}
