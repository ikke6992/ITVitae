package com.eind;

import java.util.Scanner;

public class Eindopdracht5 {

    public static int[] charCount(String text) {

        int[] results = new int[37];
        char[] chars = text.toLowerCase().toCharArray();

        for (char c : chars) {
            switch(c) {
                case 'a' -> results[0]++;
                case 'b' -> results[1]++;
                case 'c' -> results[2]++;
                case 'd' -> results[3]++;
                case 'e' -> results[4]++;
                case 'f' -> results[5]++;
                case 'g' -> results[6]++;
                case 'h' -> results[7]++;
                case 'i' -> results[8]++;
                case 'j' -> results[9]++;
                case 'k' -> results[10]++;
                case 'l' -> results[11]++;
                case 'm' -> results[12]++;
                case 'n' -> results[13]++;
                case 'o' -> results[14]++;
                case 'p' -> results[15]++;
                case 'q' -> results[16]++;
                case 'r' -> results[17]++;
                case 's' -> results[18]++;
                case 't' -> results[19]++;
                case 'u' -> results[20]++;
                case 'v' -> results[21]++;
                case 'w' -> results[22]++;
                case 'x' -> results[23]++;
                case 'y' -> results[24]++;
                case 'z' -> results[25]++;
                case '0' -> results[26]++;
                case '1' -> results[27]++;
                case '2' -> results[28]++;
                case '3' -> results[29]++;
                case '4' -> results[30]++;
                case '5' -> results[31]++;
                case '6' -> results[32]++;
                case '7' -> results[33]++;
                case '8' -> results[34]++;
                case '9' -> results[35]++;
                case ' ' -> results[36]++;
            }
        }
        return results;
    }

    public static boolean palindroom(String text) {
        StringBuilder checker = new StringBuilder(text);

        return text.equals(checker.reverse().toString());
    }

    public static String createTable(int[] charCount) {

        StringBuilder builder = new StringBuilder();

        int maxValue = 0;

        for (int value : charCount) {
            if (value > maxValue) {
                maxValue = value;
            }
        }

        for (int i = maxValue; i > 0; i--) {
            for (int value : charCount) {
                if (value >= i) {
                    builder.append("* ");
                } else {
                    builder.append("  ");
                }
            }
            builder.append("\n");
        }


        builder.append("a b c d e f g h i j k l m n o p q r s t u v w x y z 0 1 2 3 4 5 6 7 8 9");

        return builder.toString();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Voer uw tekst in:");
        String text = scanner.nextLine();

        System.out.println("Aantal karakters: " + text.toCharArray().length);

        System.out.println("Aantal woorden: " + text.split(" ").length);

        int[] results = charCount(text);
        int vowels = results[0] + results[4] + results[8] + results[14] + results[20] + results[24];

        System.out.println("Aantal klinkers: " + vowels);

        System.out.println("Palindroom: " + palindroom(text));

        System.out.println(createTable(results));

    }
    
}
