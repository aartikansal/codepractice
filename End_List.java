package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class End_List {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //write your code here
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.equals("end"))
                break;
            else
                list.add(s);
        }
        for (int i = 0; i < list.size(); i++) {
            {
                System.out.println(list.get(i));
            }
        }
    }
}

