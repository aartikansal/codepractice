package com.company;
import java.io.*;
    public class DollarPattern {
    public static void main(String[] args) throws Exception {


        int i=1;
        int j=1;
        while(i<=10){
            while(j<=10) {
                System.out.print("$");
                j++;
            }
            System.out.println(" ");
            j=1;
            i++;
        }
    }
}