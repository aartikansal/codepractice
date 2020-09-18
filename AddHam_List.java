package com.company;

import java.util.ArrayList;

public class AddHam_List {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add(2, "Ham");
        list.add(1, "Ham");
        list.add(0, "Ham");

        for (String s : list) {
            System.out.println(s);
        }
    }
}

