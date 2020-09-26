package com.company;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
/*
Time for 10,000 get calls

*/
public class Time_get_List {
    public static void main(String[] args) {
        System.out.println(getGetTimeInMs(fill(new ArrayList())));
        System.out.println(getGetTimeInMs(fill(new LinkedList())));
    }

    public static List fill(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(new Object());
        }
        return list;
    }

    public static long getGetTimeInMs(List list) {
        Date startTime = new Date();
        get10000(list);
        Date stopTime = new Date();
        long performTime = stopTime.getTime() - startTime.getTime();
        return performTime;
    }

    public static void get10000(List list) {
        if (list.isEmpty()) return;
        int x = list.size() / 2;

        for (int i = 0; i < 10000; i++) {
            list.get(x);
        }
    }
}
