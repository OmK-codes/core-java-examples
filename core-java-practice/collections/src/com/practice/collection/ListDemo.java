package com.practice.collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> car = new ArrayList<>();
        // Adding Elements
        car.add("SUV");
        car.add("MUV");
        car.add("MPV");
        car.add("Sedan");
        // Checking size
        System.out.println("Number of car types: " + car.size());
        for (String i : car) {
            System.out.println(i);
        }
    }
}
