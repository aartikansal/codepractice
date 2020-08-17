package com.company;
import java.io.*;

public class MinTwoNumbers {
        public static void main(String[] args) throws Exception {
            //write your code here
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(reader.readLine());
            int b = Integer.parseInt(reader.readLine());
            if (a < b) {
                System.out.println(a+" is minimum than "+b);
            }
            else if (a > b) {
                System.out.println("The answer is -->"+b);
            }
            else if  (a==b) {
                System.out.println("Both numbers are equal");
            }
        }
}

