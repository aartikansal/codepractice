package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;

public class Check_date {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

    SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd");
    Date firstDate = a.parse(r.readLine());

    SimpleDateFormat f = new SimpleDateFormat("MMM dd, yyyy");
    String other = f.format(firstDate);

System.out.println(other);


        }
        }