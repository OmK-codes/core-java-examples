package com.practice;
// star pattern using while loop
public class PracticeUno {
    public static void main(String[] args) {
        int i = 5;
        while (i > 0){
            int innerCounter = 0;
            while (innerCounter < i ){
                System.out.print("*");
                innerCounter++;
            }
            System.out.println();
            i--;
        }
    }
}
