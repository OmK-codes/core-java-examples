package com.practice;

/*calculate income tax paid by employee
*calculate the income tax for an employee based on the income slabs provided:
Income between 3.5 - 5.0 lakhs is taxed at 5%.
Income between 5.0 - 10.0 lakhs is taxed at 20%.
Income above 10.0 lakhs is taxed at 30%.
 */

import java.util.Scanner;

public class PracticeDos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your income : ");
        double income = s.nextDouble();
        double tax = 0;
        if (income <= 350000){
            System.out.println("No tax applicable for income below 3.5 lakh");
        } else if (income > 350000 && income <= 500000) {
            tax = (income - 350000) * 0.05;
            System.out.println("Tax to be Paid : " + tax);
        } else if (income > 500000 && income <= 1000000) {
            tax = (income - 500000) * 0.20 + (500000 - 350000) * 0.05;
            System.out.println("Tax to be Paid : " + tax);
        }
        else {
            tax = (income - 1000000) * 0.30 + (1000000 - 500000) * 0.20 + (500000 - 350000) * 0.05;
            System.out.println("Tax to be Paid : " + tax);
        }


    }

}
// in tax calculation tax calculated on two diff.income slab
// 1st on income 3.5 to 5 that is 5% and in 2nd part income above 5 to 10 that is 20%