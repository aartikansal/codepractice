package com.company;
import java.util.HashMap;
import java.util.Map;
/*
We don't need repeats
*/
public class NoRepeat_Map {
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
        public static void removeFirstNameDuplicates(Map<String, String> map) {
            int count = 0;
            HashMap<String, String> copy = new HashMap<>(map);
            for (Map.Entry<String, String> pair : copy.entrySet()) {
                count = 0;
                String Value = pair.getValue();
                for(Map.Entry<String, String> pair2 : copy.entrySet()) {
                    if (pair2.getValue().equals(Value)) {
                        count++;
                        if (count > 1){
                            removeItemFromMapByValue(map, Value);
                            break;
                        }
                    }
                }
            }
        }

        public static void removeItemFromMapByValue(Map<String, String> map, String value) {
            HashMap<String, String> copy = new HashMap<String, String>(map);
            for (Map.Entry<String, String> pair : copy.entrySet()) {
                if (pair.getValue().equals(value))
                    map.remove(pair.getKey());
            }
        }

        public static void main(String[] args) {
       HashMap<String, String> map = createMap();
       removeFirstNameDuplicates(map);
       System.out.println(map);

        }
    }
