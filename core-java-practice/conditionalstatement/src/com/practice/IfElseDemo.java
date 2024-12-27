package com.practice;

import java.util.Scanner;

public class IfElseDemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your age :");
        int m = s.nextInt();
        if (m > 18){
            System.out.println("You are eligible");
        }
        else {
            System.out.println("Not eligible");
        }
    }
}
