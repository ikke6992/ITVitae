public class ReverseString {

    public static String reverse(String text) {
        
        char[] chars = text.toCharArray();
        String reversed = "";

        for (int i = chars.length - 1; i >= 0; i--) {

            reversed += chars[i];
        }

        return reversed;
        //of maak een StringBuilder en gebruik reverse()
    }

    public static boolean palindroom(String text) {
        return text.toLowerCase().equals(reverse(text).toLowerCase());
    }

    public static void main(String[] args) {

        String text = "Abcdef";

        System.out.println(text + " -> " + reverse(text));
        System.out.println("Palindroom = " + palindroom(text));

        String text2 = "Lepel";
        
        System.out.println(text2 + " -> " + reverse(text2));
        System.out.println("Palindroom = " + palindroom(text2));

        StringBuilder test = new StringBuilder(text);
        test.delete(2, 4);
        System.out.println(test.toString());
    }
    
}
