package com.pratice;

import java.util.Scanner;

public class LowerCase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a word in UPPER CASE : ");
        String word = s.nextLine();
        String lowerCase = word.toLowerCase();
        System.out.println("lower case string " + lowerCase);

    }
}
