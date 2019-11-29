package com.company;

import java.util.ArrayList;
import java.util.Collections;

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
        for (int i = 0; i < continents.size(); i++) {
            System.out.print(continents.get(i) + " , ");
        }
        System.out.print("]");
        System.out.println();

        System.out.println("And this is an reverse array");
        System.out.print("[ ");
        for (int i = 0; i < continents.size(); i++) {
            Collections.reverse(continents);
            System.out.print(continents.get(i) + " , ");
        }
        System.out.print("]");
    }
}