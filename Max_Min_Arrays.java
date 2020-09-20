package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Min and max in arrays

*/

public class Max_Min_Arrays {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum  = Integer.MIN_VALUE;
        int minimum  = Integer.MAX_VALUE;
        //write your code here

        int[] nums = new int[20];

        for(int i = 0; i < nums.length; i++){
            nums[i] = Integer.parseInt(reader.readLine());
        }


        for ( int i = 0; i < nums.length;i++){
            if(nums[i] > maximum){
                maximum = nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++){
            if(nums[i] < minimum){
                minimum = nums[i];
            }
        }

        System.out.print(maximum + " " + minimum);
    }
}







