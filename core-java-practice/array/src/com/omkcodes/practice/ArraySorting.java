package com.omkcodes.practice;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        String[] names = {"John", "Steve", "Shane", "Adam", "Ben"}; //String
        System.out.println("String array before sorting : " + Arrays.toString(names));
        Arrays.sort(names);
        System.out.println("String array after sorting : " + Arrays.toString(names));
    //------------------------------------------------------------------------------------//
        int [] array = {45,46,85,96,85,56,87,12,1,2,3};// integer
        System.out.println("Integers array before sorting : " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Integers array after sorting : " + Arrays.toString(array));
        System.out.println(Arrays.toString(array));
    }
}
