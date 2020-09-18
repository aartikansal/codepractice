package com.company;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Three_Lists {
    public static void main(String[] args) throws Exception {
        //write your code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            list.add(Integer.valueOf(reader.readLine()));
        }
        for (int i = 0; i < list.size(); i++) {
            Integer x = list.get(i);
            if ((x % 3 == 0) && (x % 2 == 0) ) {
                list1.add(x);
                list2.add(x);
            }
            else if (x % 3 == 0) {
                list1.add(x);
            }
            else if (x % 2 == 0)
                list2.add(x);
            else
                list3.add(x) ;
        }
        printList(list1);
        System.out.println("");
        printList(list2);
        System.out.println("");
        printList(list3);
    }

    public static void printList(List<Integer> list) {
        //write your code here
        for (int x : list) {
            System.out.println(x);

        }
    }
}


