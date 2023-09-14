import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Encryption {

    public static void main(String[] args) {
        
        int a = 1;
        int b = 2;

        int cypher = a ^ b;

        /**
         * cypher is niet per se even lang als de integers, dus zorg dat de gemaakte String
         * genoeg nullen aan de voorkant toevoegt om evenlang te zijn als de maximum lengte van
         * een positieve integer
         */
        String bitString = String.format("%31s", Integer.toBinaryString(cypher)).replace(" ", "0");

        String[] bitChars = bitString.split("");

        List<String> bitList = new ArrayList<>();
        for (String c : bitChars) {
            bitList.add(c);
        }

        Collections.shuffle(bitList);
        String result = String.join("", bitList);

        int decypher = Integer.parseInt(result, 2);

        int newA = a ^ decypher;
        int newB = b ^ decypher;

        System.out.println(a + " becomes " + newA + " which is " + (a == newA));
        System.out.println(b + " becomes " + newB + " which is " + (b == newB));
    }
    
}
