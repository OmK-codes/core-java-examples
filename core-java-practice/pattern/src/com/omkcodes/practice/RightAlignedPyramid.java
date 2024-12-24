package com.omkcodes.practice;
public class RightAlignedPyramid {
    public static void main(String[] args) {
        int i = 5;
        int r = 5; //rows
        while (i > 0) {
            int t = r - i; // Calculates spaces
            int innerCounter = 0;
            while (innerCounter < t) {
                System.out.print(" ");
                innerCounter++;
            }
            innerCounter = 0;
            while (innerCounter < i) { // prints stars
                System.out.print("*");
                innerCounter++;
            }
            System.out.println();
            i--;
        }
    }
}
