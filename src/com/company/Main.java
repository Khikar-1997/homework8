package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        hospital.setName("Muracan");

        Director director = new Director();
        director.setName("P. Poxosyan - ");
        director.setAge(48);

        Doctors doctor = new Doctors();
        doctor.setName("G. Petrosyan - ");
        doctor.setAge(36);


        Doctors doctor2 = new Doctors();
        doctor2.setName("K. Grigoryan - ");
        doctor2.setAge(45);


        Doctors doctor3 = new Doctors();
        doctor3.setName("H. Hambardzumyan - ");
        doctor3.setAge(50);

        Doctors doctor4 = new Doctors();
        doctor4.setName("L. Harutyunyan - ");
        doctor4.setAge(30);

        Patients patient = new Patients();
        patient.setName("Poxos - ");
        patient.setAge(55);

        Patients patient2 = new Patients();
        patient2.setName("Petros - ");
        patient2.setAge(48);

        Patients patient3 = new Patients();
        patient3.setName("Martiros - ");
        patient3.setAge(17);

        Patients patient4 = new Patients();
        patient4.setName("Kirakos - ");
        patient4.setAge(16);

        ArrayList<Hospital> hospitals = new ArrayList<>();
        hospitals.add(hospital);
        ArrayList<Human> directors = new ArrayList<>();
        directors.add(director);
        ArrayList<Human> doctors = new ArrayList<>();
        doctors.add(doctor);
        doctors.add(doctor2);
        doctors.add(doctor3);
        doctors.add(doctor4);
        ArrayList<Human> patients = new ArrayList<>();
        patients.add(patient);
        patients.add(patient2);
        patients.add(patient3);
        patients.add(patient4);

        for (Hospital element : hospitals) {
            System.out.println("Hospital - " + element.getName());
        }
        for (Human item : directors) {
            System.out.println("Director - " + item.getName() + item.getAge());
        }
        for (Human value : doctors) {
            System.out.println("Doctors - " + value.getName() + value.getAge());
        }
        for (Human human : patients) {
            System.out.println("Patients - " + human.getName() + human.getAge());
        }
    }
}