package com.practice;

// write a program to get multiplication table of n number

import java.util.Scanner;

public class PracticeTres {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = s.nextInt();
        int i = 1;
        while (i <= 10) {
            System.out.println((n*i));
            i++;
        }
    }
}
