package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DuplicatingWords_List {
    public static void main(String[] args) throws Exception {
        // Read strings from the console and declare an ArrayList
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for(int i =0; i<10; i++)
        {
            list.add(reader.readLine());

        }

        ArrayList<String> result = doubleValues(list);

        // Display result
        for (int i =0; i<result.size();i++)
            System.out.println(result.get(i));
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for(int i =0; i<list.size(); i+=2)
        {
            list.add(i+1,list.get(i));
        }

        return list;
    }
}

