package com.company;
    public class Calculator {
        public static int plus(int a, int b) {
            int sum = a+b;
            return sum;
        }

        public static int minus(int a, int b) {
            int difference = a-b;
            return difference;
        }

        public static int multiply(int a, int b) {
            int product = a*b;
            return product;
        }

        public static double divide(int a, int b) {
            double c = (double) a/b;
            return c;
        }

        public static double percent(int a, int b) {
            double c = (double) a/b;
            return ((double)b/100)*a;
        }

        public static void main(String[] args) {

        }
    }
