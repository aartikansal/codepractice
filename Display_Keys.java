package com.company;

import java.util.HashMap;
import java.util.Map;
/*
Display a list of keys
*/

public class Display_Keys{
    public static void main(String[] args) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Sim", "Sim");
        map.put("Tom", "Tom");
        map.put("Arbus", "Arbus");
        map.put("Baby", "Baby");
        map.put("Cat", "Cat");
        map.put("Dog", "Dog");
        map.put("Eat", "Eat");
        map.put("Food", "Food");
        map.put("Gevey", "Gevey");
        map.put("Hugs", "Hugs");

        printKeys(map);
    }

    public static void printKeys(Map<String, String> map) {
        HashMap<String, String> map1 = new HashMap<String, String>();
        for (HashMap.Entry<String, String> pair : map.entrySet())
        {
            String key = pair.getKey();                      // Key
            System.out.println(key);
        }

    }
}

