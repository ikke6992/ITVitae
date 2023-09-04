/**
 * Docblock:
 * 
 * Thomas Vrielink
 * 31-08-2023
 * 
 * Waar dit project voor bedoeld is
 */
import com.cert.Opdracht1;

//Dit is commentaar
public class Test {
    public static void main(String[] args) {
        Opdracht1 opdracht1 = new Opdracht1();
        opdracht1.four = 5;
        System.out.println(opdracht1.four);

        System.out.println(args[0]);
        System.out.println(args[1]);
    }
}
