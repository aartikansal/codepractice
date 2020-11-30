package com.company;
/*
Task No. 5 about integer type conversions
*/
public class Cast5 {
    public static void main(String[] args) {
        int a = (byte) 44;
        int b = (byte) 300;
        short c = (byte) (b - a);
        System.out.println(c);
    }
}