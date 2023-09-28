import java.util.Map;
import java.util.HashMap;

import java.math.BigInteger;

public class Fibonacci {

    private static Map<Integer, BigInteger> fibNumbers = new HashMap<>();

    public static int fibonacci(int num) {
        return (num < 3) ? 1 : fibonacci(num-1) + fibonacci(num-2);
    }

    public static BigInteger quickFibonacci(int num) {
        if (fibNumbers.keySet().contains(num)) {
            return fibNumbers.get(num);
        } else {
            BigInteger fibNumber = (quickFibonacci(num-1).add(quickFibonacci(num-2)));
            fibNumbers.put(num, fibNumber);
            return fibNumber;
        }

    }

    public static void main(String[] args) {

        fibNumbers.put(1, BigInteger.valueOf(1L));
        fibNumbers.put(2, BigInteger.valueOf(1L));

        for (int i = 1; i <= 100; i++) {
            System.out.println(i + ": " + quickFibonacci(i));
        }
    }

    
    
}
