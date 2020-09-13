package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Lonely arrays interact

*/

    public class String_Int_Array {
    public static void main(String[] args) throws Exception {
    int[] arr = new int[10];
    String[] s = new String[10];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < s.length; i++) {
        String x = br.readLine();
        int a = x.length();
        arr[i] = a;
        System.out.println(arr[i]);
        }
        }
        }