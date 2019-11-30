package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        int[] arraynumbers = new int[10];
        System.out.println("This is the first array");
        System.out.print("[ ");
        for (int i = 0; i < arraynumbers.length; i++) {
            arraynumbers[i] = i;
            numbers.add(arraynumbers[i]);
            System.out.print(numbers.get(i) + " , ");
        }
        System.out.println("]");

        System.out.println();
        System.out.println("And this is an array with odd numbers");
        System.out.print("[ ");
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 != 0) {
                System.out.print(numbers.get(i) + " , ");
            }
        }
        System.out.print("]");
    }
}