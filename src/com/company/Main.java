package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setAnimalBreed("Persian cat");
        cat.setName(" - Smokey");

        Cat cat2 = new Cat();
        cat2.setAnimalBreed("Maikun");
        cat2.setName(" - Lucky");

        Cat cat3 = new Cat();
        cat3.setAnimalBreed("Siamese cat");
        cat3.setName(" - Oreo");

        Cat cat4 = new Cat();
        cat4.setAnimalBreed("Ragdoll");
        cat4.setName(" - Patch");

        Dog dog = new Dog();
        dog.setAnimalBreed("Chau chau");
        dog.setName(" - Archy");

        Dog dog2 = new Dog();
        dog2.setAnimalBreed("Pitbul");
        dog2.setName(" - Graf");

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(cat2);
        animals.add(cat3);
        animals.add(cat4);
        animals.add(dog);
        animals.add(dog2);
        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i).getAnimalBreed() + animals.get(i).getName());
        }
    }
}