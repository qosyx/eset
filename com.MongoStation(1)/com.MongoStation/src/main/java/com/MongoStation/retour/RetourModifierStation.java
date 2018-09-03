/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.MongoStation.retour;

import bl.entity.Erreurs;

/**
 *
 * @author jocardik
 */
public class RetourModifierStation {

    private int codeTraitement;
    private String idStation;
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
     * @return the idStation
     */
    public String getIdStation() {
        return idStation;
    }

    /**
     * @param idStation the idStation to set
     */
    public void setIdStation(String idStation) {
        this.idStation = idStation;
    }

    /**
     * @return the erreurs
     */
    public Erreurs getErreurs() {
        return erreurs;
    }

    /**
     * @param erreurs the erreurs to set
     */
    public void setErreurs(Erreurs erreurs) {
        this.erreurs = erreurs;
    }

}
