package com.company;

import java.util.ArrayList;

public class Animal {
    private String name;
    private String animalBreed;
    ArrayList<String> animals;

    public Animal(String name, String animalBreed, ArrayList<String> animals) {
        this.name = name;
        this.animalBreed = animalBreed;
        this.animals = animals;
    }

    public Animal() {
    }

    //region Getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnimalBreed() {
        return animalBreed;
    }

    public void setAnimalBreed(String animalBreed) {
        this.animalBreed = animalBreed;
    }

    public ArrayList<String> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<String> animals) {
        this.animals = animals;
    }
    //endregion
}
