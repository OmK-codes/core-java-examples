package com.omkcodes.practice;

public class StarPatternAsc {
    public static void main(String[] args) {
        int i = 0; // Start with the minimum number of stars
        while (i < 5) { // row count
            int innerCounter = 0;
            while (innerCounter <= i) { // column counter
                System.out.print("*"); // make sure not to print new line  println
                innerCounter++;
            }
            System.out.println(); // can use /n in print statement as well
            i++;
        }
    }
}
