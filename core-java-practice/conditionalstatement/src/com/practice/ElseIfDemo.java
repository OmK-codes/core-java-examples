package com.practice;

import java.util.Scanner;

public class ElseIfDemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter obtained marks :");
        int marks = s.nextInt();
        if (marks < 60){
            System.out.println("Fail");
        }
        else if (marks < 70) {
            System.out.println("Third Class");
        }
        else if (marks < 80) {
            System.out.println("Second Class");
        }
        else if (marks <90) {
            System.out.println("First Class");
        }
        else if (marks > 90) {
            System.out.println("Distinction");
        }
        else{
            System.out.println("Invalid Input");
        }

    }
}
