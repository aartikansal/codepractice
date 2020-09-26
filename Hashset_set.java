package com.company;

 import java.util.Set;
 import java.util.HashSet;
/*
20 words that start with the letter "L"

*/
    public class Hashset_set {
    public static Set<String> createSet() {
        HashSet<String> set = new HashSet<String>();
        for(int i=0; i<20;i++)
        {
            set.add("L"+" "+i);
        }

        return set;
    }

    public static void main(String[] args) {

    }
}
