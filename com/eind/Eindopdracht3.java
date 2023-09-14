package com.eind;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;

public class Eindopdracht3 {

    public static List<Integer> lucasNumbers(int amount) {

        List<Integer> numbers = new ArrayList<>();
        if (amount > 0) {
            numbers.add(2);

            if (amount > 1) {            
                numbers.add(1);

                for (int i = 2; i < amount; i++) {

                    try {
                        int newNumber = Math.addExact(numbers.get(i-2), numbers.get(i-1));                                               
                        numbers.add(newNumber);
                    } catch (ArithmeticException e) {
                        return new ArrayList<>();
                    }
                }
            }
        }
        return numbers;
    }
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers?");
        int amount = scanner.nextInt();

        List<Integer> numbers = lucasNumbers(amount);
        System.out.println(numbers.toString());

    }
}
