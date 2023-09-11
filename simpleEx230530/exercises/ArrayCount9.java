package exercises;

// TAGS Array.length, Array.index, arrays, foreach-loops, methods, parameters, return

/* DESCRIPTION
https://codingbat.com/prob/p184031
Given an array of ints, return the number of 9's in the array.

int[] firstArray = new int[]{1, 2, 9};
arrayCount9(firstArray) → 1
int[] secondArray = new int[]{1, 9, 9};
arrayCount9(secondArray) → 2
int[] thirdArray = new int[]{1, 9, 9, 3, 9};
arrayCount9(thirdArray) → 3
 */


public class ArrayCount9 {
    public static void main(String[] args) {
        int[] firstArray = new int[]{1, 2, 9};
        System.out.println(arrayCount9(firstArray));
        int[] secondArray = new int[]{1, 9, 9};
        System.out.println(arrayCount9(secondArray));
        int[] thirdArray = new int[]{1, 9, 9, 3, 9};
        System.out.println(arrayCount9(thirdArray));
    }

    private static int arrayCount9(int[] numbers) {
        int count = 0;
        for (int number : numbers) {
            if (number == 9) {
                count++;
            }
        }
        return count;
    }
}
