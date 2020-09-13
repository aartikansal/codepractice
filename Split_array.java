package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Split_array {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        int[] array = new int[20];
        int[] array1 = new int[10];
        int[] array2 = new int[10];

        for(int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());

            for(int x = 0; x < 10; x++) {
                array1[x] = array[x];
            }

            for(int y = 10; y < 20; y++) {
                array2[y-10] = array[y];
            }
        }


        for(int z = 0; z < 10; z++) {
            System.out.println(array2[z]);
        }


    }
}