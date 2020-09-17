package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class top_list {

        public static void main(String[] args) throws Exception {
            //write your code here
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            ArrayList<String> strings = new ArrayList<String>();
            for(int i =0; i<10;i++)
            {
                strings.add(0,reader.readLine());

            }

            for (int j=0;j<10;j++){

                System.out.println(strings.get(j));

            }

        }
    }


