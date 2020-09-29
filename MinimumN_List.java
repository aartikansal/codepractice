package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;

/*
Minimum of N numbers

*/

public class MinimumN_List {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        return Collections.min(array);
    }

    public static List<Integer> getIntegerList() throws IOException {
        // Create and initialize a list here
        int N = Integer.parseInt(bf.readLine());
        LinkedList<Integer> list = new LinkedList<Integer>();
        for(int i = 0; i < N; i++){
            list.add(Integer.parseInt(bf.readLine()));
        }
        return list;
    }
}
