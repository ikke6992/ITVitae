package bank;

public class Overboeking extends Transactie {

    public Overboeking(double bedrag, Rekening rekening) {
        super("Overboeking", bedrag);
        rekening.storten(bedrag);
    }
    
}
