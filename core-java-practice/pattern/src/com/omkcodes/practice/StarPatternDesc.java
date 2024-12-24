package com.omkcodes.practice;

public class StarPatternDesc {
    public static void main(String[] args) {
        int i = 5; // Start with the maximum number of stars
        while (i > 0) { // Loop until no stars remain
            int innerCounter = 0;
            while (innerCounter < i) { // Print 'i' stars in each row
                System.out.print("*");
                innerCounter++;
            }
            System.out.println(); // Move to the next line
            i--; // Decrease the number of stars for the next row
        }
    }
}