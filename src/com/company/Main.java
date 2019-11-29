package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> dogBreeds = new ArrayList<>();
        dogBreeds.add("Rottweiler");
        dogBreeds.add("Tibetan mastiff");
        dogBreeds.add("Engelse mastiff");
        dogBreeds.add("Chau chau");
        dogBreeds.add("German shepherd");
        System.out.println("This is the first array");
        System.out.print("[ ");
        for (int i = 0; i < dogBreeds.size(); i++) {
            System.out.print(dogBreeds.get(i) + " , ");
        }
        System.out.print("]");
        System.out.println();
        dogBreeds.remove(2);
        System.out.println("And this is an array with an extracted element ");
        System.out.print("[ ");
        for (int i = 0; i < dogBreeds.size(); i++) {
            System.out.print(dogBreeds.get(i) + " , ");
        }
        System.out.print("]");
    }
}