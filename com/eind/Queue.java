package com.eind;

public interface Queue {
    //Voeg een item toe aan de FIFO queue
    public void add(int value);
    //Verwijder een item uit de FIFO queue
    public int remove(int index);
    //Geef het eerste item in the FIFO queue terug, maar haal het er niet uit
    public int peek();
    //Geef aan of de FIFO queue leeg is
    public boolean isEmpty();
    //Geef de lengte van de FIFO queue terug
    public int size();
    //Print de inhoud van de FIFO queue
    public void print();
    //Verwijder alle items uit de FIFO queue
    public void clear();
    //Verwijder de eerste n items uit de FIFO queue
    public void clear(int n);
    //Print de inhoud van de FIFO queue in omgekeerde volgorde
    public void printReverse();
    //Plaats een element op een bepaalde positie in de FIFO queue
    public void jumpTheQueue(int n, int value);
    //Zet de FIFO queue om naar een String
    public String toString();
    //Kijk of de FIFO queue gelijk is aan een andere FIFO queue
    public boolean equals(Queue q);
    //Bepaal de index van een bepaalde waarde in de FIFO queue
    public int indexOf(int value);
    //Bepaal de laatste index van een bepaalde waarde in de FIFO queue
    public int lastIndexOf(int value);
    
}
