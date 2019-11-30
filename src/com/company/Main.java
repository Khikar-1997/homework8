package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName(" - Rex");
        dog.setDogBreed("German shepherd");

        Dog dog2 = new Dog();
        dog2.setDogBreed("Chau chau");
        dog2.setName(" - Dingo");

        Dog dog3 = new Dog();
        dog3.setDogBreed("Tibetan mastiff");
        dog3.setName(" - Vulkan");

        Dog dog4 = new Dog();
        dog4.setDogBreed("Labrador retriever");
        dog4.setName(" - Jorj");

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(dog);
        dogs.add(dog2);
        dogs.add(dog3);
        dogs.add(dog4);

        System.out.println("The dogs breeds and there names:");
        System.out.println();
        for (int i = 0; i < dogs.size(); i++) {
            System.out.println(dogs.get(i).getDogBreed() + dogs.get(i).getName() + " , ");
        }
    }
}