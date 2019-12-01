package com.company;

import java.util.ArrayList;

public class Human{
    private int age;
    private String name;
    ArrayList<Human>humans;

    public Human(int age, String name, ArrayList<Human> humans) {
        this.age = age;
        this.name = name;
        this.humans = humans;
    }

    public Human() {
    }

    //region Getter and setter
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Human> getHumans() {
        return humans;
    }

    public void setHumans(ArrayList<Human> humans) {
        this.humans = humans;
    }
    //endregion
}
