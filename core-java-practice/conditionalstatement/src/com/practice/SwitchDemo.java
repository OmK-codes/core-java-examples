package com.practice;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number (from 1-7) :");
        int n = s.nextInt();
        String d = " ";
        switch (n){
            case 1:d = "Monday";
                // System.out.println("Monday"); // one way to implement
            break;
            case 2: d= "Tuesday";
            break;
            case 3: d = "Wednesday";
            break;
            case 4: d = "Thursday";
            break;
            case 5: d = "Friday";
            break;
            case 6: d = "Saturday";
            break;
            case 7: d = "Sunday";
            break;
            default:
                System.out.println("Invalid Number");
        }
        System.out.println(" Day of the week :" + d);
    }
}
