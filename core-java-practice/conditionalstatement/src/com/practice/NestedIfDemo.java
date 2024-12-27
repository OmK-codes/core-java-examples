package com.practice;

import java.util.Scanner;

public class NestedIfDemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your Age :");
        int age = s.nextInt();
        System.out.println("Enter your weight :");
        int w = s.nextInt();
        if (age > 18){
            if (w > 50){
                System.out.println("Enjoy Your Ride ;) ");
            }
        }
        else{
            System.out.println("You are not eligible for ride !!!");
        }
    }
}
