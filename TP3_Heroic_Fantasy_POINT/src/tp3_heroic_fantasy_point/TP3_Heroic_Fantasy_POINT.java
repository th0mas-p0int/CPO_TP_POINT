/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_point;

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
            
        
        
    }
}
