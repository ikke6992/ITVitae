public abstract class Vogel {

    private int afstand = 0;

    public void vlieg(int afstand) {
        this.afstand += afstand;
    }

    public int getAfstand() {
        return afstand;
    }
    
}
