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
        ArrayList<Director> directors = new ArrayList<>();
        directors.add(director);
        ArrayList<Doctors> doctors = new ArrayList<>();
        doctors.add(doctor);
        doctors.add(doctor2);
        doctors.add(doctor3);
        doctors.add(doctor4);
        ArrayList<Patients> patients = new ArrayList<>();
        patients.add(patient);
        patients.add(patient2);
        patients.add(patient3);
        patients.add(patient4);

        for (int i = 0; i < hospitals.size(); i++) {
            System.out.println("Hospital - "+hospitals.get(i).getName());
        }
        for (int i = 0; i < directors.size(); i++) {
            System.out.println("Director - " + directors.get(i).getName()+directors.get(i).getAge());
        }
        for (int i = 0; i < doctors.size(); i++) {
            System.out.println("Doctors - " + doctors.get(i).getName() + doctors.get(i).getAge());
        }
        for (int i = 0; i < patients.size(); i++) {
            System.out.println("Patients - "+patients.get(i).getName() + patients.get(i).getAge());
        }
    }
}