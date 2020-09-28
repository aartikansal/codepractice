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
        Map<String, String> people = new HashMap<String, String>();
        people.put("Kansal","Aarti");
        people.put("Kansal","Amit");
        people.put("Kansal","Eva");
        people.put("Lumb","Aarti");
        people.put("Mcguire","Tom");
        people.put("Prasad","Ram");
        people.put("Blair","Tony");
        people.put("Jain","Aastha");
        people.put("Connor","Woo");
        people.put("Pandit","Rachna");

        return people;
        }


        public static void printPeopleMap (Map < String, String > map){
            for (Map.Entry<String, String> s : map.entrySet()) {
                System.out.println(s.getKey() + " " + s.getValue());
            }
        }
    }


