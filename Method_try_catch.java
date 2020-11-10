package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Method_try_catch {

    public static void main(String[] args) {
        readData();
    }

    public static void readData() {

        ArrayList<Integer> list = new ArrayList<>();
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int x;
            while (true){
                x=Integer.parseInt(reader.readLine());
                list.add(x);
                System.out.println(list);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
        //write your code here
    }
}

