package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Shuffled just in time

*/

public class Shuffled_list { 
        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            //write your code here
            ArrayList<String> list = new ArrayList<String>();
            int N = Integer.parseInt(reader.readLine());
            int M = Integer.parseInt(reader.readLine());
            for (int i = 0; i < N; i++)
            {
                list.add(reader.readLine());
            }

            for (int i = 0; i < M; i++)
            {
                list.add(list.get(i));
                //  list.remove(i);
            }

            for (int k = 0; k < M; k++)
            {
                list.remove(0);
            }
            for(String s : list){
                System.out.println(s);
            }

        }
    }

