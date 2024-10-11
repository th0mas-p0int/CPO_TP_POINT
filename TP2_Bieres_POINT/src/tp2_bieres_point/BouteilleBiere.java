/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_point;

/**
 *
 * @author thomaspoint
 */
public class BouteilleBiere {
    String Nom; 
    float degreAlcool;
    String brasserie;
    boolean ouverte;
    
    public BouteilleBiere(String unNom, float unDegre, String
uneBrasserie) {
Nom = unNom;
degreAlcool = unDegre;
brasserie = uneBrasserie;
ouverte = false;
}
public boolean Decapsuler() {
    if (ouverte == false) {
        ouverte = true;
        return true;  
    } else {
        System.out.println("Erreur : bière déjà ouverte");
        return false;  
    }
}
    
    public void lireEtiquette() {
System.out.println("Bouteille de " + Nom +" (" + degreAlcool +
" degres) \nBrasserie : " + brasserie ) ;
}

}
    
