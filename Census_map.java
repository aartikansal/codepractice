package com.company;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
/*
Census
*/
    public class Census_map {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<String,String>();
        map.put("Amit", "Kansal");
        map.put("Aarti ", "Kansal");
        map.put("Amita", "Chopra");
        map.put("Baby", "Talwar");
        map.put("Cat", "Dhingra");
        map.put("Deepak", "Chopra");
        map.put("Carlie", "Cook");
        map.put("Emma", "Watson");
        map.put("Gevey", "Finleigh");
        map.put("Hugs", "Ghosh");
        return map;
    }

    public static int getSameFirstNameCount(HashMap<String, String> map, String name) {
        int firstCount =0;
        for (HashMap.Entry<String, String> pair : map.entrySet()) {
            if (name.contains(pair.getValue())) {
                firstCount++;
            }
        }
            return firstCount;
        }

    public static int getSameLastNameCount(HashMap<String, String> map, String lastName) {
        int lastCount =0;
        for(Map.Entry<String, String> pair :map.entrySet()){
            if(lastName.contains(pair.getKey())){
                lastCount++;
            }
        }
         return lastCount++;
    }

    public static void main(String[] args) {

    }
}








