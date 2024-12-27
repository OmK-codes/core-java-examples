package com.practice;
// write a program to sum first n numbers using while loop

import java.util.Scanner;

public class practiceDos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number :");
         int n = s.nextInt();
         int sum = 0;
         int i = 1;
         while (i <= n){
             sum += i;
             i++;
         }
        System.out.println("Sum of n number :" + sum);
    }
}
