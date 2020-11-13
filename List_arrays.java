package com.company;



/*
List of number arrays

*/

import java.util.ArrayList;

public class List_arrays {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> list = new ArrayList<int[]>();
        int[] five = {1, 2, 3, 4, 5};
        int[] two = {6, 7};
        int[] four = {8, 9, 10, 11};
        int[] seven = {12, 13, 14, 15, 16, 17, 18};
        int[] zero = {};

        list.add(five);
        list.add(two);
        list.add(four);
        list.add(seven);
        list.add(zero);
        return list;

    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}