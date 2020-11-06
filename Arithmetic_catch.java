package com.company;



public class Arithmetic_catch {
    public static void main(String[] args) throws Exception {
        try {
            int a = 42 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}