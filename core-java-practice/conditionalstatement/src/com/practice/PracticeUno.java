package com.practice;

import java.util.Scanner;

// practice 1
// write a program to know student pass or fail
//check whether a student passes or fails based on two conditions:
//Total percentage of all subjects should be at least 40%.
//At least 35% marks in each subject.
// using operator

/*pseudo code
get the marks from user
check the marks are not less than 35
calculate total obtained marks
calculate the percentage of total marks and check they are not less than 40
* */


public class PracticeUno {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);;
        System.out.println("Enter marks in Maths :");
        int maths = s.nextInt();
        System.out.println("Enter marks in Physics :");
        int physics = s.nextInt();
        System.out.println("Enter marks in Chemistry :");
        int chemistry = s.nextInt();
        int totalMarkSubject = 100;
        int totalMarks = 3 * totalMarkSubject;
        boolean subjectsWiseMarks = maths >=35 && physics >=35 && chemistry >= 35;
        int totalObtained = maths + physics + chemistry;
        double percentage = (totalObtained *100) / totalMarks;
        if (percentage < 40){
            System.out.println("Student has failed :");
        }
        else {
            System.out.println("Congrats you have passed the exam");
        }
        System.out.println("Total Marks :" + totalMarkSubject + "/" + "Marks Obtained :"+ totalObtained );
        System.out.println("Percentage obtained :" + percentage);

    }
}
