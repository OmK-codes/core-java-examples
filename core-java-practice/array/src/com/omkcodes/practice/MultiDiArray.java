package com.omkcodes.practice;

public class MultiDiArray {
        public static void main(String[] args) {
            int[][] matrix = {
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12}
            };
            // Accessing elements
            System.out.println("Element at row 1, column 2: " + matrix[1][2]);
//-----------------------------------------------------------------------------//
            // Iterating through the array
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
}
