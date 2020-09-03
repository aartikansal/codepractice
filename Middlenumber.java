package com.company;
import java.util.Scanner;
public class Middlenumber {
    public  static  void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a >= b && a <= c) {
            System.out.println(a);
        } else if (b >= a && b <= c) {
            System.out.println(b);
        } else if (c >= a && c <= b) {
            System.out.println(c);
        } else if (a > b && b > c && c != a) {
            System.out.println(b);
        } else if (a > b && b < c && c < a) {
            System.out.println(c);
        } else if (a == b || a == c) {
            System.out.println(a);
        } else if (b == a || b == c) {
            System.out.println(b);
        } else if (c == a || c == b) {
            System.out.println(c);
        } else {
            System.out.println(a); }
    }
}



