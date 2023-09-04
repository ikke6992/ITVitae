package com.cert;

//Klasse die geimporteerd hoort te worden om het verschil tussen static en non-static te testen
public class Importeerbaar {
    
    private static int sharedNumber = 0;
    private int ownNumber;

    //Constructor zet ownNumber op de meegegeven integer
    public Importeerbaar(int number) {
        ownNumber = number;
    }

    //Methode om sharedNumber te veranderen
    public static void setSharedNumber(int number) {
        sharedNumber = number;
    }

    //Methode om sharedNumber op te vragen
    public static int getSharedNumber() {
        return sharedNumber;
    }

    //Methode om ownNumber te veranderen
    public void setOwnNumber(int number) {
        ownNumber = number;
    }

    //Methode om ownNumber op te vragen
    public int getOwnNumber() {
        return ownNumber;
    }
}
