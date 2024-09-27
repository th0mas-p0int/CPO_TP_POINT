/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_point;

import java.util.Scanner;

/**
 *
 * Thomas POINT TDC TP1
 */
public class TP1_manipNombresInt_POINT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b;
        int Add;
        int Diff;
        int Mult;
        double Rest;
        double Quo;
        double c;
        c=1.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Choisir un nombre : ");
        a = sc.nextInt();
        System.out.println("Choisir un deuxième nombre : ");
        b = sc.nextInt();
        Add=a+b;
        Diff=a-b;
        Mult=a*b;
        Quo=(a*c)/b;
        Rest=(a*c)%b;
        
        System.out.println("Le premier nombre est "+a+" et le deuxième est "+b+".");
        System.out.println("La somme de "+a+" et de "+b+" est "+Add+".\nLa difference entre "+a+" et "+b+" est "+Diff+".\nLe produit de "+a+" par "+b+" est "+Mult+".");        
        System.out.println("Le quotient de "+a+" par "+b+" est "+Quo+".\nSon reste est "+Rest+".");
    }
    
}
