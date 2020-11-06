package com.company;



/*
Exception when working with arrays

*/

public class Array_catch {
    public static void main(String[] args) throws Exception {
        try{

            int[] m = new int[2];
            m[8] = 5;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
