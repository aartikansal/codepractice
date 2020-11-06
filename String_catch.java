package com.company;

public class String_catch {
    public static void main(String[] args) throws Exception {
        try
        {
            String s = null;
            String m = s.toLowerCase();
        }
        catch (NullPointerException e)
        {
            System.out.println(e);
        }
    }
}
