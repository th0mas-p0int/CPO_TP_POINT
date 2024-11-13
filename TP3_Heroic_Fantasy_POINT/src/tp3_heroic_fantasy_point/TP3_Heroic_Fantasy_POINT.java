/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_point;

import Personnages.Personnage;
import Personnages.Magicien;
import Personnages.Guerrier;
import Armes.baton;
import Armes.Epee;
import Armes.Arme;
import java.util.ArrayList;
/**
 *
 * @author thomaspoint
 */
public class TP3_Heroic_Fantasy_POINT {
    public static void main(String[] args) {
        ArrayList<Arme>armes = new ArrayList<Arme>();
        
        Epee Excalibur = new Epee("Excalibur",7,5);
        Epee Durandal = new Epee("Durandal", 4, 7);
        baton Chene = new baton("Chêne",4, 5);
        baton Charme = new baton("Charme", 5, 6);
        
        armes.add(Excalibur);
        armes.add(Durandal);
        armes.add(Chene);
        armes.add(Charme);
        
        System.out.println("Liste des armes: ");
        for (int i = 0; i < armes.size(); i++){
            Arme arme = armes.get(i);
            System.out.println("Arme "+ (i+1) + ":" + arme);
        }
           
        ArrayList<Personnage> perso = new ArrayList<Personnage>();
        
        Magicien Gandalf = new Magicien("Gandalf", 65, true);
        Magicien Garcimor = new Magicien("Garcimor", 44, false);
        Guerrier Conan = new Guerrier("Conan", 78, false);
        Guerrier Lannister = new Guerrier("Lannister", 45, true);
        Magicien Harry = new Magicien("Harry", 100, true);
        Guerrier Batman = new Guerrier("Batman", 1000, false);
        
        perso.add(Gandalf);
        perso.add(Garcimor);
        perso.add(Conan);
        perso.add(Lannister);
        
        System.out.println("\nListe des personnages");
        for (int j = 0; j < perso.size(); j++) {
            Personnage personnage = perso.get(j);
            System.out.println("Nom " + (j+1) + " " + personnage);
        }
        
        Gandalf.equiperArme("Chêne");
        Conan.equiperArme("Durandal");
        
        System.out.println("\nListe des personnages après ajout et équipement des armes:");
        for (int j = 0; j < perso.size(); j++) {
            Personnage personnage = perso.get(j);
            System.out.println("Nom " + (j + 1) + "  " + personnage);
    
    }
    
    }
}
// question 38 en cours