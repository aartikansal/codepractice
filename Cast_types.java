package com.company;
/*
Task No. 1 about integer type conversions

*/
public class Cast_types {
    public static void main(String[] args) {
        int a = 0;
        int b = (int) a + 46;
        byte c = (byte) (a * b);
        double f = (double) 1234.15;
        long d = (long) (a + f / c + b);
        System.out.println(d);
    }
}
