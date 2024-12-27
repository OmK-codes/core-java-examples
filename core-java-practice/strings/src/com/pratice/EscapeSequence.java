package com.pratice;

import java.util.Scanner;

public class EscapeSequence {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String word = s.nextLine();
        System.out.println( word + "\"" + "you are cute \"" );
    }
}
