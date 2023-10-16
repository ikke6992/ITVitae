package bank;

import java.util.ArrayList;
import java.util.List;

public class Rekening implements RekeningInterface {

    private Persoon eigenaar;
    private int rekeningnummer;

    private double saldo;
    private List<Transactie> transacties;

    public Rekening(Persoon persoon) {
        saldo = 0;
        transacties = new ArrayList<Transactie>();
        eigenaar = persoon;
        rekeningnummer = (int)(Math.random()*100_000_000);
    }

    public double huidigSaldo() {
        return saldo;
    }

    public void storten(double bedrag) {
        transacties.add(new Storting(bedrag));
        saldo += bedrag;
    }

    public void overboeken(double bedrag, Rekening rekening) {
        transacties.add(new Overboeking(bedrag, rekening));
        saldo -= bedrag;
    }

    public String geschiedenis() {
        StringBuilder builder = new StringBuilder();
        for (Transactie transactie : transacties) {
            builder.append(transactie.toString() + "\n");
        }
        return builder.toString();
    }

    public int getNummer() {
        return rekeningnummer;
    }

    public String getEigenaar() {
        return eigenaar.getNaam();
    }


    
}
