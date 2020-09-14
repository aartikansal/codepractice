package com.company;

import java.io.BufferedReader;
import java.io.*;
public class House_Array {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(br.readLine());
            int sumEven = 0;
            int sumOdd = 0;
            if (i % 2 == 0) {
                sumEven = sumEven + array[i];
                System.out.println("Odd-numbered houses have more residents.");
            }
            else
                sumOdd = sumOdd + array[i];
            System.out.println("Even-numbered houses have more residents.");

        }

    }

}
