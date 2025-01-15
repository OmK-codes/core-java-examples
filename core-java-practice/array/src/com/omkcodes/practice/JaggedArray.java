package com.omkcodes.practice;

public class JaggedArray {
    public static void main(String[] args) {
        int[][] jaggedArray = {
                {1, 2},
                {3, 4, 5, 6},
                {7, 8, 9}
        };
        // Accessing elements
        System.out.println("Element at row 2, column 1: " + jaggedArray[2][1]); // Output: 8

        // Iterating through the array
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}