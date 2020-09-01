package com.company;



import java.io.*;
import java.util.Scanner;
public class NegPos  {
    public static void main(String[] args) throws Exception {
        //Scanner sc = new Scanner(System.in);
       /* int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();*/
        /*if (a>0 && b>0 && c>0)
        {
            System.out.println("Number of negative numbers: 0");
            System.out.println("Number of positive numbers:3");
        }
        else if(a>0 && b>0 || c>0)
        {
            System.out.println("Number of negative numbers: 1");
            System.out.println("Number of positive numbers : 2");
        }
        else if (a>0 || b>0 && c>0)
        {
            System.out.println("Number of negative numbers: 1");
            System.out.println("Number of positive numbers : 2");
        }
        else if (b>0 || c>0 && a>0)
        {
            System.out.println("Number of negative numbers: 1");
            System.out.println("Number of positive numbers : 2");
        }
        else if (b<0 && a<0 && c<0)
        {
            System.out.println("Number of negative numbers: 3");
            System.out.println("Number of positive numbers : 0");
        }*/

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