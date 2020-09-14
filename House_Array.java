package com.company;

import java.io.BufferedReader;
import java.io.*;
public class House_Array {
    public static void main(String[] args) throws Exception {
    int[] array = new int[15];
    int sum1=0;
    int sum2=0;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<15;i++){
        array[i] = Integer.parseInt(reader.readLine());

    }
        for(int i=0;i<15;i++){
        sum1 = sum1 + array[i];
        i++;
    }

        for(int i=1;i<15;i++){
        sum2 += array[i];
        i++;
    }

        if(sum1>sum2){
        System.out.println("Even-numbered houses have more residents.");
    }else
            System.out.println("Odd-numbered houses have more residents.");
}
}