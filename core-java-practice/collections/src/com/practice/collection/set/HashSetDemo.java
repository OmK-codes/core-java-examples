package com.practice.collection.set;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        // Create a HashSet of Integer type
        HashSet<Integer> hashset = new HashSet<>();

        // Add elements to the HashSet
        hashset.add(1);
        hashset.add(2);

        // Clone the HashSet
        HashSet<Integer> clonedSet = (HashSet<Integer>) hashset.clone();

        // Print the cloned set
        System.out.println("Cloned HashSet: " + clonedSet);

        // Print the original HashSet
        System.out.println("HashSet example: " + hashset);

        // Print the size of the HashSet
        System.out.println("Size of HashSet: " + hashset.size());
    }
}
