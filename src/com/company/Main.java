package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> continents = new ArrayList<>();
        continents.add("North America");
        continents.add("Europe");
        continents.add("Asia");
        continents.add("Africa");
        continents.add("Sout America");
        continents.add("Antarctica");
        continents.add("Australia");
        System.out.println("This is the first array");
        System.out.print("[ ");
        for (String continent : continents) {
            System.out.print(continent + " , ");
        }
        System.out.print("]");
        System.out.println();

        System.out.println("And this is an empty array");
        continents.clear();
        System.out.println(continents);
    }
}