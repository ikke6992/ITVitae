import java.util.Scanner;

public class CaesarCypher {

    public static String encypher(String text, int num) {
        char[] chars = text.toCharArray();
        String result = "";
        int shift = num % 26;

        for (char c : chars) {
            if ((c >= 'a' && c <= (char)((int)'z'-shift)) || (c >= 'A' && c <= (char)((int)'Z'-shift))) {
                result += (char)(c+shift);
            } else if ((c > (char)((int)'z'-shift) && c <= 'z') || (c > (char)((int)'Z'-shift) && c <= 'Z')) {
                result += (char)(c-26+shift);
            } else {
                result += c;
            }
        }
        /*
            char[] output;
            for (int i = 0; i < text.length; i++) {
                output[i] = (char)((int)text.charAt(i) - 'A' + 3) % 26 + 'A';
            }
            result = new String(output);
        */
        return result;
    }

    public static String decypher(String text, int num) {
        char[] chars = text.toCharArray();
        String result = "";
        int shift = num % 26;

        for (char c : chars) {
            if ((c >= (char)((int)'a'+shift) && c <= 'z') || (c >= (char)((int)'A'+shift) && c <= 'Z')) {
                result += (char)(c-shift);
            } else if ((c >= 'a' && c < (char)((int)'a'+shift)) || (c >= 'A' && c < (char)((int)'a'+shift))) {
                result += (char)(c+26-shift);
            } else {
                result += c;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
               
        System.out.println(encypher("TESTING", 3));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type text to encypher");
        String text = scanner.nextLine();
        System.out.println("Input the number to be shifted");
        int shift = scanner.nextInt();
        String encyphered = encypher(text, shift);
        System.out.println("Encyphered text: " + encyphered);

        System.out.println("Decyphered text: " + decypher(encyphered, shift));



        scanner.close();
    }
    
}
