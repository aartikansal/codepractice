package com.company;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Remove_Insert_List {

    public static void main(String[] args) throws Exception {
        //write your code here
        ArrayList<String> lists = new ArrayList<String>(5);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        for(int i=0;i<5;i++){
            String s = reader.readLine();
            lists.add(s);
        }

        for(int i=0;i<13;i++){
            lists.add(0, lists.remove(4));

        }

        for(int i=0;i<5;i++){
            System.out.println(lists.get(i));

        }

    }
}





