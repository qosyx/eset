/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.MongoStation.retour;

import bl.entity.Erreurs;
import entity.InfosStation;

/**
 *
 * @author jocardik
 */
public class RetourLireStation {

    private int codeTraitement;
    private InfosStation infosStation;
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
     * @return the infosStation
     */
    public InfosStation getInfosStation() {
        return infosStation;
    }

    /**
     * @param infosStation the infosStation to set
     */
    public void setInfosStation(InfosStation infosStation) {
        this.infosStation = infosStation;
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
