package com.company;

import java.util.ArrayList;

public class Animal {
    private String dogBreed;
    ArrayList<String> dogs;

    public Animal(String dogBreed, ArrayList<String> dogs) {
        this.dogBreed = dogBreed;
        this.dogs = dogs;
    }

    public Animal() {
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    public ArrayList<String> getDogs() {
        return dogs;
    }

    public void setDogs(ArrayList<String> dogs) {
        this.dogs = dogs;
    }
}
