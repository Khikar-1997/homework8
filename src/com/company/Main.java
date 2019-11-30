package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setCatBreed("Persian cat");
        cat.setName(" - Smokey");

        Cat cat2 = new Cat();
        cat2.setCatBreed("Maikun");
        cat2.setName(" - Lucky");

        Cat cat3 = new Cat();
        cat3.setCatBreed("Siamese cat");
        cat3.setName(" - Oreo");

        Cat cat4 = new Cat();
        cat4.setCatBreed("Ragdoll");
        cat4.setName(" - Patch");

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(cat);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        for (int i = 0; i < cats.size(); i++) {
            System.out.println(cats.get(i).getCatBreed() + cats.get(i).getName() + ", ");
        }
    }
}