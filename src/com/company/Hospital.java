package com.company;

import java.util.ArrayList;

public class Hospital {
    private String name;
    private int age;
    ArrayList<Hospital> hospitalsProgram;

    public Hospital(String name, int age, ArrayList<Hospital> hospitalsProgram) {
        this.name = name;
        this.age = age;
        this.hospitalsProgram = hospitalsProgram;
    }

    public Hospital(String name, ArrayList<Hospital> hospitalsProgram) {
        this.name = name;
        this.hospitalsProgram = hospitalsProgram;
    }

    public Hospital() {
    }

    //region Getter and setter
    public ArrayList<Hospital> getHospitalsProgram() {
        return hospitalsProgram;
    }

    public void setHospitalsProgram(ArrayList<Hospital> hospitalsProgram) {
        this.hospitalsProgram = hospitalsProgram;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //endregion
}
