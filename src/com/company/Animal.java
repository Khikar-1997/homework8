package com.company;

import java.util.ArrayList;

public class Animal {
    private String catBreed;
    ArrayList<String> cats;

    public Animal(String catBreed, ArrayList<String> cats) {
        this.catBreed = catBreed;
        this.cats = cats;
    }

    public Animal() {
    }

    public String getCatBreed() {
        return catBreed;
    }

    public void setCatBreed(String catBreed) {
        this.catBreed = catBreed;
    }

    public ArrayList<String> getCats() {
        return cats;
    }

    public void setCats(ArrayList<String> cats) {
        this.cats = cats;
    }
}
