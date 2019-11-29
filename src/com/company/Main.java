package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> movies = new ArrayList<>();
        movies.add("Gotti");
        movies.add("Titanic");
        movies.add("The Revenant");
        movies.add("The Hobbit");
        movies.add("Braveheart");
        System.out.println("This is the first array");
        System.out.print("[ ");
        for (int i = 0; i < movies.size(); i++) {
            System.out.print(movies.get(i) + " , ");
        }
        System.out.print("]");
        System.out.println();
        movies.remove(2);
        System.out.println("And this is an array with an extracted element ");
        System.out.print("[ ");
        for (int i = 0; i < movies.size(); i++) {
            System.out.print(movies.get(i) + " , ");
        }
        System.out.print("]");
    }
}
