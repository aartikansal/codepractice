package com.company;
import java.util.Scanner;
import java.util.Arrays;


/*
Ascending numbers
*/
     public class Sort5 {
     public static void main(String[] args) throws Exception {
        int[] myList = new int[5];
        Scanner kb = new Scanner(System.in);
        for (int i = 0; i < myList.length; i++) {
            myList[i] = kb.nextInt();
        }
        for (int i = 0; i < myList.length; i++) {
            Arrays.sort(myList);
            System.out.println(myList[i]);
        }
    }
}

