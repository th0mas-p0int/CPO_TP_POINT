/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_calculator;

import java.util.Scanner;

/**
 *
 * Thomas POINT TP0 20/09/2024
 */
public class TP0_Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Operator;
        int Operande1;
        int Operande2;
        int result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the operator: \n1) add \n2) substract \n3) multiply \n4) divide \n5) modulo");
        Operator=sc.nextInt();
        System.out.println("Entrer une première valeur :");
        Operande1=sc.nextInt();
        System.out.println("Entrer une seconde valeur :");
        Operande2=sc.nextInt();
        if (Operator==1){
            result=Operande1+Operande2;
        }
        Else if (Operator==2){
            result=Operande1-Operande2;
    }
    }
    
}
