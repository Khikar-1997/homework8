package com.company;

import java.util.ArrayList;

public class Human extends Hospital{
    private int age;

    public Human(String name, ArrayList<Hospital> hospitalsProgram, int age) {
        super(name, hospitalsProgram);
        this.age = age;
    }

    public Human() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
