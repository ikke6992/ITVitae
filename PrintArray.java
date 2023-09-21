import java.util.Arrays;
import java.util.Scanner;

public class PrintArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Voer het aantal items in: ");
        int NUM_ITEMS = scanner.nextInt();
        scanner.nextLine();
        int[] items = new int[NUM_ITEMS];

        System.out.print("Voer de waarde van alle items in (gescheiden door\nspatie): ");
        //int[] items = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");

        for (int i = 0; i < (Math.min(numbers.length, NUM_ITEMS)); i++) {

            items[i] = Integer.parseInt(numbers[i]);
        }

        System.out.println("De waarden zijn: " + Arrays.toString(items));
        
        for (int item : items) {

            StringBuilder builder = new StringBuilder();

            for (int i = 0; i < item; i++) {

                builder.append('*');

            }

            System.out.printf("%s(%d)\n", builder.toString(), item);
        }



    }
    
}
