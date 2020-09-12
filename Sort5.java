package com.company;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;




/*
Ascending numbers

*/


public class Sort5 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer[] numbers  = new Integer[5];
        int j = 0;


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }

        for (Object number : ascending(numbers)){
            j++;
            System.out.println((int)number);
        }
    }

    public static Collection ascending(Integer[] list){

        Collection integers = new TreeSet<Integer>();
        Collections.addAll(integers, list);

        return integers;
    }
}
