package com.company;



import java.util.ArrayList;

/*
Exception when working with List collections

*/

public class ArrayList_catch {
    public static void main(String[] args) throws Exception {
        try
        {
            ArrayList<String> list = new ArrayList<String>();
            String s = list.get(18);
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
    }
}