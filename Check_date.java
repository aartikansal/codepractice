package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Check_date {
    public static void main(String[] args) throws Exception {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        SimpleDateFormat ymd = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat mdy = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);

        String s = rd.readLine();
        Date date = ymd.parse(s);

        System.out.println(mdy.format(date).toUpperCase());

    }
}
