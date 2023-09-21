import java.util.Scanner;
import java.util.ArrayList;

public class Galgje {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = "";

        do {
            
            System.out.println("Enter a word:");
            String option = scanner.nextLine();
            if (option.matches("[a-zA-Z]*")) {
                word = option.toUpperCase();
            }
        } while (word.equals(""));

        for (int i = 0; i < 50; i++) {
            System.out.println();
        }

        int turn = 0;
        boolean winner = false;
        char[] chars = word.toCharArray();
        ArrayList<Character> letters = new ArrayList<Character>();
        for (char c : chars) {
            letters.add(c);
        }

        ArrayList<Character> guessedLetters = new ArrayList<Character>();
        String empty = "";
        for (int i = 0; i < letters.size(); i++) {
            guessedLetters.add('_');
            empty += '_';
        }
        System.out.println(empty);

        do {
            System.out.println("What is your next guess?");
            String guess = scanner.nextLine().toUpperCase();

            if (guess.length() != 1) {
                if (guess.equals(word)) {
                    winner = true;
                    for (int i = 0; i < letters.size(); i++) {
                        guessedLetters = letters;
                    }
                } else {
                    System.out.println("That guess is incorrect");
                }
            } else {
                char letter = guess.charAt(0);
                for (int i = 0; i < letters.size(); i++) {
                    if (letter == letters.get(i)) {
                        guessedLetters.set(i, letter);
                    }
                }
            }

            StringBuilder builder = new StringBuilder();
            for (char c : guessedLetters) {
                builder.append(c);
            }

            String guessedWord = builder.toString();
            if (guessedWord.equals(word)) {
                winner = true;
            }
            System.out.println(guessedWord);

            turn++;
        } while (!winner && turn < 10);

        if (winner) {
            System.out.println("Congratulations! You found the word!");
        } else {
            System.out.println("You've been hanged! The word was " + word);
        }
    }
}
