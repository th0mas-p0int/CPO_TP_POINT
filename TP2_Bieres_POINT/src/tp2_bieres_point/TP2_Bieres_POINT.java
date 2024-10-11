/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_point;

/**
 *
 * @author thomaspoint
 */
public class TP2_Bieres_POINT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", (float) 7.0,"Dubuisson") ;
uneBiere.ouverte = false;
uneBiere.Decapsuler();
uneBiere.lireEtiquette();

BouteilleBiere laBiere = new BouteilleBiere("Leffe", (float) 6.6,"Abbaye de Leffe");
laBiere.lireEtiquette();

BouteilleBiere Biere3 = new BouteilleBiere ("Biere du Mont Blanc", (float) 4.3, "Brasseries aint George");
Biere3.lireEtiquette();

BouteilleBiere Biere4 = new BouteilleBiere("Ninkasi", (float) 9.7, "Ninkasi");
Biere4.lireEtiquette();

BouteilleBiere Biere5 = new BouteilleBiere("86", (float) 3.1, "Carrefour");
Biere5.lireEtiquette();
    }
    
}
