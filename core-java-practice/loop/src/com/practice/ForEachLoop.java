package com.practice;

import java.util.List;

public class ForEachLoop {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        for (Integer number : numbers) {
            System.out.println("Number =" + number);
        }
    }
}