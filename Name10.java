package com.company;

 import java.io.*;
public class Name10 {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();

        for (int i = 0; i < 10; i++) {
            System.out.println(name1 + " loves me.");
        }
    }


}