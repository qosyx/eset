/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moncompte;

/**
 *
 * @author archange
 */
public class Compte {

    private int numCompte;
    private int soldeCompte;

    public Compte() {
    }

    public Compte(int numCompte, int soldeCompte) {
        this.numCompte = numCompte;
        this.soldeCompte = soldeCompte;
    }

    public int getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(int numCompte) {
        this.numCompte = numCompte;
    }

    public int getSoldeCompte() {
        return soldeCompte;
    }

    public void setSoldeCompte(int soldeCompte) {
        this.soldeCompte = soldeCompte;
    }

    public void debiterCompte(int montant) {
        if (montant > this.soldeCompte) {
            System.out.println("Montant supérieur à votre solde : " + montant);
        } else {
            this.soldeCompte = this.soldeCompte - montant;

        }

    }

    public void crediterCompte(int montant) {
        this.soldeCompte = this.soldeCompte + montant;
    }
}
