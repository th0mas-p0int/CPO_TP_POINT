/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_.point;

/**
 *
 * @author thomaspoint
 */
public class TP2_manip_POINT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Tartiflette assiette1 = new Tartiflette(500) ;
Tartiflette assiette2 = new Tartiflette(600) ;
Tartiflette assiette3 = assiette2 ;

System.out.println("nb de calories de Assiette 2 : " +
assiette2.nbCalories) ;
System.out.println("nb de calories de Assiette 3 : " +
assiette3.nbCalories) ;

assiette2.nbCalories += 100;

        // Affichage après modification
        System.out.println("Après modification:");
        System.out.println("Calories assiette 2: " + assiette2.nbCalories);
        System.out.println("Calories assiette 3: " + assiette3.nbCalories);

        // Tentative de manipulation de références entre assiette1 et assiette2
        Tartiflette temp = assiette1;
        assiette1 = assiette2;
        assiette2 = temp;

        System.out.println("Après échange des références:");
        System.out.println("Calories assiette 1: " + assiette1.nbCalories);
        System.out.println("Calories assiette 2: " + assiette2.nbCalories);

        // Test sur les références Moussaka
        // Tableau de 10 Moussaka
        Moussaka[] moussakas = new Moussaka[10];
        for (int i = 0; i < moussakas.length; i++) {
            moussakas[i] = new Moussaka(100 * (i + 1));
        }

        // Affichage des calories des Moussakas
        System.out.println("Calories des Moussakas:");
        for (int i = 0; i < moussakas.length; i++) {
            System.out.println("Moussaka " + (i + 1) + " : " + moussakas[i].nbCalories + " calories");
        }
    }
}
