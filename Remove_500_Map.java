package com.company;

import java.util.HashMap;
import java.util.Map;

/*
Only for the rich

*/

public class Remove_500_Map {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Kansal", 1000);
        map.put("Dhingra", 700);
        map.put("Raut", 400);
        map.put("Hava", 350);
        map.put("Galo", 900);
        map.put("Kans", 1000);
        map.put("Dhing", 700);
        map.put("Rau", 400);
        map.put("Hav", 350);
        map.put("Gal", 900);
        return map;
    }
    public static void removeItemFromMap(HashMap<String, Integer> map) {
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            if (pair.getValue() < 500) {
                map.remove(pair.getKey());
                removeItemFromMap(map);
                break;
            }

        }
    }



    public static void main(String[] args) {

    }
}