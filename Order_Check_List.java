package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Order_Check_List {
    public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<String> list = new ArrayList<String>();
        for(int i =0; i<10;i++)
    {
        list.add(reader.readLine());
    }
        int max = 0;

        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i).length() >= max)
            {
                max = list.get(i).length();
            } else
            {
                System.out.print(i);
            }
        }
    }
}
