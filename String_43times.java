package com.company;
/*
Big salary
*/

public class String_43times {
    public static void main(String[] args) {
        String s = "I do not want to learn Java. I want a big salary";
        for (int i = 0; i < 43; i++) {
            System.out.println(s);
            s = s.substring(1);
        }
    }
}
