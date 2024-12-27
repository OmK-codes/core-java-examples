package com.pratice;

import java.util.Scanner;
//replace space with _
public class ReplaceDemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter word with space :");
        String w = s.nextLine();
        String newWord = w.replace(' ', '_');
        System.out.println("new :" + newWord);
        replaceEx();
    }

    public static void replaceEx() {
        Scanner n = new Scanner(System.in);
        String word = "Hello name, thank you for visiting";
        System.out.println("Enter your Name :");
        String input = n.nextLine();
        String newString = word.replace("name",input);
        System.out.println(newString);

    }
}
