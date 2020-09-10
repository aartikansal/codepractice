package com.company;


public class StringHelper {
    public static String multiply(String s) {
        String result = "";
        //write your code here
        for(int i=0; i<5 ;i++){
            result +=s;
        }

        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";
        //write your code here
        for(int i=0 ;i<count ;i++){
            result +=s;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(multiply("Here"));
        System.out.println(multiply("here",7));

    }
}