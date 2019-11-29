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

        ArrayList<String> carBreands = new ArrayList<>();
        carBreands.add("Mersedes");
        carBreands.add("BMW");
        carBreands.add("Audi");
        carBreands.add("Ford");
        carBreands.add("Toyota");
        carBreands.add("Nissan");
        carBreands.add("Lada");
        System.out.println("This is the second array");
        System.out.print("[ ");
        for (String carBreand : carBreands) {
            System.out.print(carBreand + " , ");
        }
        System.out.println("]");
        System.out.println();

        ArrayList<String> concatArrays = new ArrayList<>(continents);
        concatArrays.addAll(carBreands);
        System.out.println(concatArrays);
    }
}