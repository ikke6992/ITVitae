package bank;

public interface RekeningInterface {

    public double huidigSaldo();

    public void storten(double bedrag);
    
    public void overboeken(double bedrag, Rekening rekening);

    public String geschiedenis();

    public int getNummer();

    public String getEigenaar();
}
