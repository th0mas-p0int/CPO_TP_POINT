/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur.pkg_.point;

import java.util.Scanner;

/**
 * TP1 Exo 2 Thomas POINT TDC
 * @author thomaspoint
 */
public class TP1_convertisseur_POINT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double a,b,K;
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Choisir un nombre : ");
    a = sc.nextDouble();
    System.out.println("Votre nombre est : "+a+".");
    K=273.15+a;
    System.out.println("On a donc une temperature en Kelvin de "+K+".");
    }
    
}
