package com.company;



import java.util.HashMap;

/*
Exception when working with Map collections

*/

public class Hashmap_catch {
    public static void main(String[] args) throws Exception {
        try
        {
            HashMap<String, String> map = new HashMap<String, String>(null);
            map.put(null, null);
            map.remove(null);
        }
        catch(NullPointerException e)
        {
            System.out.println(e);
        }
    }
}
