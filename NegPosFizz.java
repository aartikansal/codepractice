package com.company;



import java.io.*;
import java.util.Scanner;
     public class NegPosFizz{
     public static void main(String[] args) throws Exception {
        //write your code here
        Scanner sc = new Scanner (System.in);
        int b = sc.nextInt();

        if((b % 2  == 0) && (b < 0))
        {
            System.out.println("Negative even number");
        }
        else if ((b % 2 != 0) && (b < 0))
        {
            System.out.println("Negative odd number");
        }
        else if(b == 0)
        {
            System.out.println("Zero");
        }
        else if ((b % 2 == 0) && (b > 0))
        {
            System.out.println("Positive even number");
        }
        else if ((b % 2 ==1) &&(b > 0))
        {
            System.out.println("Positive odd number");
        }

    }
}
