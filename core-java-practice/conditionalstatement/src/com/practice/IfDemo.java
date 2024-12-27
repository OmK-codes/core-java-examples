package com.practice;
//Check if a number is positive
import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = s.nextInt();
        if (age > 18){
            System.out.println(" age is greater than 18");
        }
    }
}
