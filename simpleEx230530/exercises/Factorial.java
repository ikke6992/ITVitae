package exercises;

// TAGS for-loops, int, operators-arithmetic, Scanner, Scanner.nextInt(), System.out.print(), System.out.printf()

import java.util.Scanner;

/* DESCRIPTION
Calculate the factorial of a number: the factorial is the number x number -1 x number - 2 .. 1
So 1! = 1, 2! = 2x1 = 2, 3! = 3 x 2 x 1 = 6, 4! = 4 x 3 x 2 x 1 = 24 etc.
See also https://en.wikipedia.org/wiki/Factorial

Sample run:
Please enter an integer greater than zero: 5
The factorial of 5 is 120
 */
public class Factorial {
    public static void main(String[] args) {
        System.out.print("Please enter an integer greater than zero: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.printf("The factorial of %d is %d", number, factorial);
    }
}
