import java.util.Scanner;

public class OddEvenTest {

    public static boolean isOdd(int getal) {
        return getal % 2 == 1;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Voer getal in: ");
        int getal = scanner.nextInt();
        
        System.out.println(isOdd(getal));
    }
    
}
