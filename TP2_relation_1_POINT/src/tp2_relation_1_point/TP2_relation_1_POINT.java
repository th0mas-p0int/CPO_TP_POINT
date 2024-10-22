/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_point;

/**
 *
 * @author thomaspoint
 */
public class TP2_relation_1_POINT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Personne bob = new Personne("Sixkiller", "Bobby");
        Personne reno = new Personne("Raines", "Reno");

        Voiture clio = new Voiture("Clio", "Renault", 5);
        Voiture peugeot = new Voiture("2008", "Peugeot", 6);
        Voiture micra = new Voiture("Micra", "Nissan", 4);

        bob.ajouterVoiture(clio);
        bob.ajouterVoiture(peugeot);

        reno.ajouterVoiture(micra);

        System.out.println(bob);
        System.out.println(reno);

        System.out.println("Essai d'ajouter une voiture déjà possédée:");
        reno.ajouterVoiture(clio);
        Voiture porsche = new Voiture("Porsche", "Porsche", 500);
        bob.ajouterVoiture(porsche);  // Cela doit échouer
    }
    
}
