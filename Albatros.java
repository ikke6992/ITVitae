public class Albatros extends Vogel {

    private double spanwijdte;
    private boolean vermoeid;

    public Albatros() {
        this(3.7);
    }

    public Albatros(double spanwijdte) {
        this.spanwijdte = spanwijdte;
        vermoeid = false;
    }

    public void vlieg() {
        super.vlieg(1000);
    }

    public void vlieg(int afstand) {
        super.vlieg(afstand);
        if (afstand > 1000) {
            vermoeid = true;
        }
    }

    public void rust() {
        vermoeid = false;
    }

    public double getSpanwijdte() {
        return spanwijdte;
    }

    public String toString() {
        return String.format("De albatros met een spanwijdte van %f meter is %svermoeid na %d kilometer te hebben gevlogen."
            , getSpanwijdte(), vermoeid ? "" : "niet ", getAfstand());
    }

    public static void main(String[] args) {
        Albatros albatros = new Albatros();
        albatros.vlieg(1500);
        System.out.println(albatros);
        albatros.rust();
        albatros.vlieg();
        System.out.println(albatros);
    }
    
}
