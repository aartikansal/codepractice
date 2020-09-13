package com.company;




import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Maximum in an array

*/

public class Max_Array {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // Create and populate the array
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for(int i = 0; i<20; i++){
            array[i] = Integer.parseInt(r.readLine());
        }
        return array;
    }

    public static int max(int[] array) {
        // Find the maximum
        int max = array[0];
        for(int i = 0; i<array.length; i++){
            if(array[i]>max) max = array[i];
        }
        return max;
    }
}