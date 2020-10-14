package com.company;

import java.util.Scanner;

public class Triangle {

        public static void main(String[] args) throws Exception {
            //write your code here
            Scanner sc = new Scanner (System.in);

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if(a<b+c && b<a+c && c<a+b)
            {
                System.out.println("The triangle is possible.");

            }
            else
                System.out.println("The triangle is not possible.");

        }



}
