/**
 * @author Thomas Vrielink
 * @date 31-08-2023
 * 
 * Project dat test of static variables echt gedeeld worden en non-static niet
 */
package com.eind;

import com.cert.Importeerbaar;

//Klasse die test of importeren werkt en het verschil tussen static en non-static te laten zien
public class Eindopdracht {

    //Main methode die de test uitvoert en de resultaten aan de gebruiker laat zien
    public static void main(String[] args) {

        Importeerbaar nummer1 = new Importeerbaar(1);
        Importeerbaar nummer2 = new Importeerbaar(2);

        System.out.println("Voor veranderen\nEerste constructor:");
        System.out.println("Gedeeld nummer: " + nummer1.getSharedNumber());
        System.out.println("Eigen nummer: " + nummer1.getOwnNumber());

        System.out.println("\nTweede constructor:");
        System.out.println("Gedeeld nummer: " + nummer2.getSharedNumber());
        System.out.println("Eigen nummer: " + nummer2.getOwnNumber() + "\n");

        Importeerbaar.setSharedNumber(3);
        nummer2.setOwnNumber(4);

        System.out.println("Na veranderen\nEerste constructor:");
        System.out.println("Gedeeld nummer: " + nummer1.getSharedNumber());
        System.out.println("Eigen nummer: " + nummer1.getOwnNumber());

        System.out.println("\nTweede constructor:");
        System.out.println("Gedeeld nummer: " + nummer2.getSharedNumber());
        System.out.println("Eigen nummer: " + nummer2.getOwnNumber() + "\n");
    }


    
}
