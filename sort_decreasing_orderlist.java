package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class sort_decreasing_orderlist {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
       for(int i =0; i< array.length;i++)
           for(int j =0; j<array.length;j++)
           {
               if(array[i]>array[j]){
                   int temp =array[j];
                   array[j]=array[i];
                   array[i] =temp;
               }
           }
    }
}





