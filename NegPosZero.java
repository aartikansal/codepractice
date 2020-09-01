package com.company;



import java.io.*;
import java.util.Scanner;
public class NegPosZero  {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int countPositive=0;
        int countNegative=0;
        if(a>0) {
            countPositive++;
        } else {
            countNegative++;
        }
        if(b>0)
        {
            countPositive++;
        } else {
            countNegative++;
        }
        if(c>0) {
            countPositive++;
        }else {
            countNegative++;
        }
        if (a==0 || b==0|| c==0)
        {
           countNegative--;
        }
        System.out.println("Number of negative numbers:"+countNegative);
        System.out.println("Number of positive numbers:"+countPositive);
    }


}