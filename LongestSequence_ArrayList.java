package com.company;

import java.io.*;
import java.util.ArrayList;

/*
Longest sequence

*/
    public class LongestSequence_ArrayList {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i =0; i < 10; i++){
            list.add(Integer.valueOf(reader.readLine()));
        }
        int max = 0;
        int tempCounter = 1;
        for (int i = 0; i < list.size() - 1; i++) {

            if (list.get(i).equals(list.get(i + 1))) {
                tempCounter++;
            } else if (!list.get(i).equals(list.get(i + 1))) {
                tempCounter = 1;
            }

            if (tempCounter > max) {
                max = tempCounter;
            }
        }
        System.out.println(max);

    }
}