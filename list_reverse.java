package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class list_reverse {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 5; i++){
            list.add(reader.readLine());
        }
        for(int i = 0; i < 5; i++){
            System.out.println(list.get(i));
        }
        list.remove(2);
        for(int i = 0; i < 4; i++){
            System.out.println("After Removal --> "+list.get(i));
        }
        for( int i = 3; i >= 0; i--)
        {
            System.out.println(list.get(i));
        }
    }
}



