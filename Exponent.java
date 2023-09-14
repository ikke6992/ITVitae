import java.util.Scanner;

public class Exponent {

    public static int exponent(int basis, int macht) {
        
        int exponent = 1;

        for (int i = 0; i < macht; i++) {
            exponent *= basis;
        }

        return exponent;

        //OF: return Math.pow(basis, macht);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Voer basis in: ");
        int basis = scanner.nextInt();
        
        System.out.print("Voer macht in: ");
        int macht = scanner.nextInt();

        int exponent = exponent(basis, macht);
        System.out.printf("%d tot de macht %d is: %d", basis, macht, exponent);
    }
    
}
