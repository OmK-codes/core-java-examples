package com.practice;

import java.util.Scanner;

/*write a program to find out the type of website from the url that user entered .com, .org, .in*/
/*pseudo code
* get the input
* use endswith()
* */
public class PracticeTres {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the url : ");
        String url = s.nextLine();
        if (url.endsWith(".com")){
            System.out.println("Entered url is Commercial website !!");
        } else if (url.endsWith(".in")) {
            System.out.println("Entered url is Indian website !!");
        } else if (url.endsWith(".org")) {
            System.out.println("Entered url is Organization website !!");
        }
        else {
            System.out.println("Enter valid url");
        }

    }
}
