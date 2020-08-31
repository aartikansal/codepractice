package com.company;


import java.util.Scanner;

public class DescribingNumbers {

    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        calNum(a);
    }

    public static void calNum(int b) {
        if (b<1 || b > 999) {
        } else if (b / 100 >= 1) {
            if (b % 2 == 0) {
                System.out.println("even three-digit number");
            } else {
                System.out.println("odd three-digit number");
            }
        }
        else if (b / 10 >= 1) {
                if (b % 2 == 0) {
                    System.out.println("even two-digit number");
                } else {
                    System.out.println("odd two-digit number");
                }
        }
            else if (b % 2 == 0) {
                    System.out.println("even single-digit number");
                } else {
                    System.out.println("odd single-digit number");
                }



        }
    }





