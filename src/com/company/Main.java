package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Petros");
        names.add("Poxos");
        names.add("Martiros");
        names.add("Anna");
        names.add("Mane");
        System.out.println("This is the first array");
        System.out.print("[ ");
        for (int i = 0; i < names.size(); i++) {
            System.out.print(names.get(i) + " , ");
        }
        System.out.print("]");
        System.out.println();
        System.out.println("And this is an array with a new element in the first position");
        names.set(0, "Maria");
        System.out.print("[ ");
        for (int i = 0; i < names.size(); i++) {
            System.out.print(names.get(i) + " , ");
        }
        System.out.print("]");
    }
}
