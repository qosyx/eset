/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moncompte;
import moncompte.Compte;

/**
 *
 * @author archange
 */
public class MonCompte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Compte compte1 = new Compte(1, 0);
        compte1.crediterCompte(10000);
        compte1.debiterCompte(15000);
        System.out.println("Le solde du compte 1 est : " + compte1.getSoldeCompte());
        
    }
    
}
