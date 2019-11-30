package com.company;

import java.util.ArrayList;

public class Cat extends Animal {
    private String name;

    public Cat(String catBreed, ArrayList<String> cats, String name) {
        super(catBreed, cats);
        this.name = name;
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
