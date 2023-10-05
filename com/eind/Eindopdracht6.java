package com.eind;

import java.util.LinkedList;

public class Eindopdracht6 implements Queue {

    private LinkedList<Integer> list;

    public Eindopdracht6() {
        list = new LinkedList<>();
    }

    public Eindopdracht6(int... values) {
        this();
        for (int value : values) {
            add(value);
        }
    }

    public void add(int value) {
        list.add(value);
    }

    public int remove(int index) {
        return list.remove((index));
    }

    public int peek() {
        return list.get(0);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    public void print() {
        System.out.println(toString());
    }

    public void clear() {
        list.clear();
    }

    public void clear(int n) {
        LinkedList<Integer> kopie = new LinkedList<>();
        for (int i = n; i < size(); i++) {
            kopie.add(list.get(i));
        }
        list = kopie;
    }

    public void printReverse() {
        String result = "";
        for (int i = size() - 1; i >= 0; i--) {
            result += list.get(i) + " ";
        }
        System.out.println(result);
    }

    public void jumpTheQueue(int n, int value) {
        list.add(n, value);
    }

    public String toString() {
        String result = "";
        for (int i : list) {
            result += i + " ";
        }
        return result;
    }

    public boolean equals(Queue q) {
        return toString().equals(q.toString());
    }

    public int indexOf(int value) {
        for (int i = 0; i < size(); i++) {
            if (list.get(i) == value) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(int value) {
        for (int i = size() - 1; i >= 0; i--) {
            if (list.get(i) == value) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] values = new int[]{1, 1, 2, 3, 5, 8, 13};
        
        Eindopdracht6 opdracht = new Eindopdracht6(values);
        
        //Test indexOf
        System.out.println("Index of 1: " + opdracht.indexOf(1));
        
        //Test lastIndexOf
        System.out.println("Last index of 1: " + opdracht.lastIndexOf(1));
        
        //Test printReverse
        opdracht.printReverse();

        Eindopdracht6 kopie = new Eindopdracht6(values);

        //Test equals == true
        opdracht.print();
        kopie.print();
        System.out.println(opdracht.equals(kopie));

        //Test add
        opdracht.add(21);
        
        //Test equals == false
        opdracht.print();
        kopie.print();
        System.out.println(opdracht.equals(kopie));

        //Test remove
        opdracht.remove(7);

        //Test equals == true after alterations
        opdracht.print();
        kopie.print();
        System.out.println(opdracht.equals(kopie));

        //Test jumpTheQueue
        opdracht.jumpTheQueue(4, 4);
        opdracht.print();

        //Test peek
        opdracht.remove(0);
        opdracht.remove(0);
        opdracht.print();
        System.out.println(opdracht.peek());

        //Test isEmpty == false after clearing first n elements 
        opdracht.clear(2);
        opdracht.print();
        System.out.println(opdracht.isEmpty());
        
        //Test isEmpty == true after clearing entire list
        opdracht.clear();
        opdracht.print();
        System.out.println(opdracht.isEmpty());;
    }
    
}
