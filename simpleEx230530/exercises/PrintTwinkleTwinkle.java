package exercises;

// TAGS text-blocks

/* DESCRIPTION
https://www.w3resource.com/java-exercises/basic/index.php
 Write a Java program to print the following string in a specific format (see the output).
Sample Output

Twinkle, twinkle, little star,
	How I wonder what you are!
		Up above the world so high,
		Like a diamond in the sky.
Twinkle, twinkle, little star,
	How I wonder what you are
 */

public class PrintTwinkleTwinkle {
    public static void main(String[] args) {
        System.out.println("""
                Twinkle, twinkle, little star,
                	How I wonder what you are!
                		Up above the world so high,
                		Like a diamond in the sky.
                Twinkle, twinkle, little star,
                	How I wonder what you are
                """);
    }
}
