package com.company;
/*
Correct answer: d = 5.5

*/
public class cast8{
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int c = 3;
        int e = 2;
        double d = a + b / c / (double) e;
        System.out.println(d);
    }
}
