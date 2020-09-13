package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class More_reverse {

    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[10];
        for(int i =0; i<10;i++)
        {
            array[i]= Integer.parseInt(br.readLine());
        }
        for(int i = 9; i>=0;i--)
        {
            System.out.println(array[i]);
        }
    }
}

