package com.omkcodes.practice;

import java.util.ArrayList;
import java.util.List;

public class ArrayToCollection {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");


        String[] array = list.toArray(new String[0]);
        //toArray(new T[0]) ensures the
        // returned array has the correct type.


        //Object[] array = list.toArray();
        for (String obj : array){
        System.out.println(obj);

    }
    }
}
