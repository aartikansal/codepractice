package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
String array in reverse order

*/

public class Reverse_String {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String [10];
        for (int i = 0; i < 8; i++) {
            array[i] = String.valueOf(Integer.parseInt(r.readLine()));
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}

     