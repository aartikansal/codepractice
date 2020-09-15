package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

    public class Shortest_String_List {
    public static void main(String[] args) throws Exception {

        ArrayList<String> array = new ArrayList<String>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int  min=0 ;

        for(int i=0;i<5;i++)
        {
            String s = reader.readLine();
            array.add(s);


            min=array.get(0).length();

            if(array.get(i).length()<min)
            {
                min=array.get(i).length();


            }
        }
        for(int i=0 ; i<5;i++)
        {
            if(min==array.get(i).length())
            {
                System.out.println(array.get(i));
            }
        }



    }
}

