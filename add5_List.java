package com.company;

import java.util.ArrayList;

public class add5_List {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("a");
        list.add("r");
        list.add("t");
        list.add("i");
        System.out.println(list.size());
        for(int i =0; i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
    }
}

