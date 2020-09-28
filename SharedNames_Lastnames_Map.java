package com.company;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
Shared last names and first names

*/

public class SharedNames_Lastnames_Map {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String, String> map1 = new Map<String, String>() {
        map.put("Kansal","Aarti");
        map.put("Kansal","Amit");
        map.put("Kansal","Eva");
        map.put("Lumb","Aarti");
        map.put("Mcguire","Tom");
        map.put("Prasad","Ram");
        map.put("Blair","Tony");
        map.put("Jain","Aastha");
        map.put("Connor","Woo");
        map.put("Pandit","Rachna");
        return map1;
        }


        public static void printPeopleMap (Map < String, String > map){
            for (Map.Entry<String, String> s : map.entrySet()) {
                System.out.println(s.getKey() + " " + s.getValue());
            }
        }
    }
}
