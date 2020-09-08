package com.company;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Minimum5 {

        public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(reader.readLine());
            int b = Integer.parseInt(reader.readLine());
            int c = Integer.parseInt(reader.readLine());
            int d = Integer.parseInt(reader.readLine());
            int e = Integer.parseInt(reader.readLine());

            int minimum = min(a,b,c,d,e);

            System.out.println("Minimum = " + minimum);
        }

    public static int min(int a, int b,int c,int d,int e) {
        int temp =  a < b ? a : b;
        temp =  temp < c ? temp : c;
        temp =  temp < d ? temp : d;
        temp =  temp < e ? temp : e;
        return temp;
    }
}
