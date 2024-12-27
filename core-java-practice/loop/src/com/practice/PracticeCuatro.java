package com.practice;

// write program to find factorial of number

import java.util.Scanner;

public class PracticeCuatro {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int n = s.nextInt();
        int fact = 1;
        for (int i=1; i <=n ; i++){
            fact *=i;
        }
        System.out.println(fact);
    }
}
