package com.company;



/*
Exception when working with numbers

*/

public class Parse_catch {
    public static void main(String[] args) throws Exception {
        try{

            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        }
        catch(NumberFormatException e)
        {
            System.out.println(e);
        }
    }
}
