/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.MongoStation.domains;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 *
 * @author archange
 */
@Document(collection = "InfosStation")
public class InfosStation {

    @Indexed(unique = true)
    @Field(value = "idStation")
    private String idStation;

    @Indexed(unique = true)
    @Field(value = "ville")
    private String ville;

    @Indexed(unique = true)
    @Field(value = "pays")
    private String pays;

    @Indexed(unique = true)
    @Field(value = "nomStation")
    private String nomStation;

    @Indexed(unique = true)
    @Field(value = "numeroRue")
    private String numeroRue;

    @Indexed(unique = true)
    @Field(value = "rue")
    private String rue;

    @Indexed(unique = true)
    @Field(value = "complementAdresse")
    private String complementAdresse;

    @Indexed(unique = true)
    @Field(value = "codePostal")
    private String codePostal;

    @Indexed(unique = true)
    @Field(value = "coordonnesGeo")
    private String coordonnesGeo;

    @Indexed(unique = true)
    @Field(value = "statut")
    private StatutStation statut;

    public String getIdStation() {
        return idStation;
    }

    public void setIdStation(String idStation) {
        this.idStation = idStation;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getNomStation() {
        return nomStation;
    }

    public void setNomStation(String nomStation) {
        this.nomStation = nomStation;
    }

    public String getNumeroRue() {
        return numeroRue;
    }

    public void setNumeroRue(String numeroRue) {
        this.numeroRue = numeroRue;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getComplementAdresse() {
        return complementAdresse;
    }

    public void setComplementAdresse(String complementAdresse) {
        this.complementAdresse = complementAdresse;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getCoordonnesGeo() {
        return coordonnesGeo;
    }

    public void setCoordonnesGeo(String coordonnesGeo) {
        this.coordonnesGeo = coordonnesGeo;
    }

    public StatutStation getStatut() {
        return statut;
    }

    public void setStatut(StatutStation statut) {
        this.statut = statut;
    }

}
