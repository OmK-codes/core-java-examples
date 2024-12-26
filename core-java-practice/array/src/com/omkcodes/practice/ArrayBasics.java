package com.omkcodes.practice;
public class ArrayBasics {
        public static void main(String[] args) {

            // Step 1: Declaring an array of integers
            int[] numbers = new int[5]; // Array of 5 integers, initially all elements are 0

            // Step 2: Initializing the array with values
            numbers[0] = 10; // First element (index 0) is set to 10
            numbers[1] = 20; // Second element (index 1) is set to 20
            numbers[2] = 30; // Third element (index 2) is set to 30
            numbers[3] = 40; // Fourth element (index 3) is set to 40
            numbers[4] = 50; // Fifth element (index 4) is set to 50

            // Step 3: Accessing and printing array elements
            // We can access array elements by their index (starting from 0)
            System.out.println("Array elements using index:");
            System.out.println("Element at index 0: " + numbers[0]); // Prints 10
            System.out.println("Element at index 1: " + numbers[1]); // Prints 20
            System.out.println("Element at index 2: " + numbers[2]); // Prints 30
            System.out.println("Element at index 3: " + numbers[3]); // Prints 40
            System.out.println("Element at index 4: " + numbers[4]); // Prints 50

            // Step 4: Using a loop to iterate through the array
            // way to access all elements of an array is by using a loop
            System.out.println("\nArray elements using a loop:");
            for (int i = 0; i < numbers.length; i++) { // numbers.length gives the size of the array
                System.out.println("Element at index " + i + ": " + numbers[i]);
            }

            // Step 5: Modifying array elements
            // We can change any value in the array by accessing it via its index
            numbers[2] = 100; // Changing the third element (index 2) to 100

            // Step 6: Printing the updated array using a loop again
            System.out.println("\nUpdated array elements after modification:");
            for (int i = 0; i < numbers.length; i++) {
                System.out.println("Element at index " + i + ": " + numbers[i]);
            }

            // Step 7: Array Size
            // We can also get the size (number of elements) in the array using numbers.length
            System.out.println("\nThe size of the array is: " + numbers.length); // Outputs 5

            // Step 8: Array with Default Values
            // If you don't explicitly initialize an array, it will have default values based on the data type
            double[] decimals = new double[3]; // Creates an array of 3 doubles
            // The default value for doubles is 0.0
            System.out.println("\nArray of doubles with default values:");
            for (int i = 0; i < decimals.length; i++) {
                System.out.println("Element at index " + i + ": " + decimals[i]);
            }
        }
    }
