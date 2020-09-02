package com.company;
import java.io.*;
public class Multiplication10 {
    public static void main(String[] args) throws Exception {
        //write your code here
        int i = 1;
        int j =1;
        while(i<=10){
            while(j<=10){
                System.out.print(i*j+" ");
                j++;
            }
            i++;
            j=1;
            System.out.println();
        }
    }
}
