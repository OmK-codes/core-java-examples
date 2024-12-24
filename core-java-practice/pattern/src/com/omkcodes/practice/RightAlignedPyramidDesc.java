package com.omkcodes.practice;

public class RightAlignedPyramidDesc {
    public static void main(String[] args) {
        int i = 5; //maximum number of stars
        int r = 5; //rows
        while (i > r) {
            int s = i - r - 1; //space calculation
            int innerCounter = 0;
            while (innerCounter < i) {
                System.out.print(" ");
                innerCounter++;
            }
            while (i > 0) { // Loop until no stars remain
                while (innerCounter <= i) { // Print 'i' stars in each row
                    System.out.print("*");
                    innerCounter++;
                }
            }
            System.out.println();
            i--;
        }
    }
}
