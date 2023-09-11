package com.eind;

import java.util.Scanner;

public class Eindopdracht2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int getal;

        do {
            System.out.println("Geef een geheel positief getal");
            getal = scanner.nextInt();
        } while (getal < 0);

        int oneven = somVanOnevenGetallen(getal);
        int even = somVanEvenGetallen(getal);

        System.out.println("som van oneven getallen tot en met " + 
            getal + " is " + oneven);
        System.out.println("som van even getallen tot en met " + 
            getal + " is " + even);
        System.out.println("verschil tussen twee sommen is " + 
            Math.abs(oneven - even));        
    }

    public static int somVanOnevenGetallen(int max) {
        
        int som = 0;
        for (int i = 1; i <= max; i+=2) {
            som += i;
        }
        return som;
    }

    public static int somVanEvenGetallen(int max) {

        int som = 0;
        for (int i = 2; i <= max; i+=2) {
            som += i;
        }
        return som;
    }
    
}
