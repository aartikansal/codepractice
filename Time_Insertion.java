package com.company;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/*
Time for 10,000 insertions

*/

public class Time_Insertion {
    public static void main(String[] args) {
        System.out.println(getInsertTimeInMs(new ArrayList()));
        System.out.println(getInsertTimeInMs(new LinkedList()));
    }

    public static long getInsertTimeInMs(List list) {
        long StartTime = System.currentTimeMillis();
        insert10000(list);
        long timeDifference = System.currentTimeMillis() - StartTime;
        return timeDifference;
    }
    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }
}


