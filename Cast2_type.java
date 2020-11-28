package com.company;
/*
Task No. 2 about integer type conversions

*/
public class Cast2_type {
    public static void main(String[] args) {
        int a = 15;
        int b = 4;
        float c = (float)a / b;
        double d = (double)a * 1e-3 + c;
        System.out.println(d);
    }
}
