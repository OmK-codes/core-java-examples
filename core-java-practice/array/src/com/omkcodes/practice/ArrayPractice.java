package com.omkcodes.practice;

public class ArrayPractice {
    public static void main(String[] args) {
        int [] marks = new int[5];
        System.out.println("size " + marks.length);

        System.out.println("--------------Demo For-Each-Loop------------");
        for(int element : marks){
            System.out.println("Elements" + element);
        }
        System.out.println("-----------------Demo For-loop--------------");
        for (int index = 0; index < marks.length; index++){
            System.out.println(index);
        }
        System.out.println("-----------------Demo while-loop--------------");
        int i = 0;
        while (i < marks.length){
            System.out.println(marks[i]);
            i++;
        }
    }

}
