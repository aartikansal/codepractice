package com.company;


import java.io.*;
import java.util.Scanner;


public class TrafficSignal {


    public static void main(String[] args) throws Exception {
        //write your code here

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double n = Double.valueOf(reader.readLine());
        double roundN = Math.floor(n);
        double lightTime = roundN % 5;

        if (lightTime >= 0 && lightTime < 3) {
            System.out.println("green");
        } else if (lightTime >= 3 && lightTime < 4) {
            System.out.println("yellow");
        } else {
            System.out.println("red");
        }
    }
}
