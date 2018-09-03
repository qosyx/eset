/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.MongoStation.retour;

import bl.entity.Erreurs;
import entity.InfosStation;
import java.util.List;

/**
 *
 * @author Christian
 */
public class RetourRechercherStation {

    private int codeTraitement;
    private List<InfosStation> listeStation;
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
     * @return the listeStation
     */
    public List<InfosStation> getListeStation() {
        return listeStation;
    }

    /**
     * @param listeStation the listeStation to set
     */
    public void setListeStation(List<InfosStation> listeStation) {
        this.listeStation = listeStation;
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
