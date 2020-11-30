package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/*
Ten cats
*/
public class Map_tenCats {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        HashMap<String, Cat> result = new HashMap<String, Cat>();
        result.put("1", new Cat("1"));
        result.put("2", new Cat("2"));
        result.put("3", new Cat("3"));
        result.put("4", new Cat("4"));
        result.put("5", new Cat("5"));
        result.put("6", new Cat("6"));
        result.put("7", new Cat("7"));
        result.put("8", new Cat("8"));
        result.put("9", new Cat("9"));
        result.put("0", new Cat("0"));

        return result;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        return new HashSet<Cat>(map.values());
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }

}
