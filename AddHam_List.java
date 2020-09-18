package com.company;

import java.util.ArrayList;

public class AddHam_List {
    public static void main(String[] args) throws Exception {
        ArrayList<String > list = new ArrayList<>();
        list.add("Sam");
        list.add("I");
        list.add("Am");
        String H = "Ham";

        for (int i = 1; i < list.size()+1; i += 2) {
            list.add(i, H);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}





