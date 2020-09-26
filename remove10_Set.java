package com.company;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
Greater than 10? You're not a good fit for us

*/
public class remove10_Set {
        public static HashSet<Integer> createSet() {
            HashSet<Integer> set = new HashSet<Integer>();
            for (int i = 0; i < 20; i++) {
                set.add(i);
                //System.out.println("In createSet");
            }
            return set;
        }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        /*set.removeIf(integer -> integer > 10);
        return set;   lambda expression*/
        Iterator i = set.iterator();
        while(i.hasNext()) if((Integer)i.next() > 10) i.remove();
        //return set;

        return set;
    }

    public static void main (String[]args){

    }

}
