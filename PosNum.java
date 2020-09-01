package com.company;


import java.io.*;
import java.util.Scanner;
public class PosNum {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int num = 3;
        int arr[] = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > 0) {
                count++;
            }

        }
        System.out.println(count);
    }
}
