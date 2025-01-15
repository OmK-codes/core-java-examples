package com.omkcodes.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAsList {
    public static void main(String[] args) {
        String[] stringArray = {"ram", "Sham","suresh"};
        List<String> stringList = Arrays.asList(stringArray);
        System.out.println(stringList);
    }
}
