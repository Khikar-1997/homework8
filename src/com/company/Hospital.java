package com.company;

import java.util.ArrayList;

public class Hospital {
    private String name;
    ArrayList<Hospital>hospitalsProgram;

    public Hospital(String name, ArrayList<Hospital> hospitalsProgram) {
        this.name = name;
        this.hospitalsProgram = hospitalsProgram;
    }

    public Hospital() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Hospital> getHospitalsProgram() {
        return hospitalsProgram;
    }

    public void setHospitalsProgram(ArrayList<Hospital> hospitalsProgram) {
        this.hospitalsProgram = hospitalsProgram;
    }
}
