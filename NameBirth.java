package com.company;


import java.io.*;

public class NameBirth  {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int yyyy = Integer.parseInt(reader.readLine());
        int mm = Integer.parseInt(reader.readLine());
        int dd = Integer.parseInt(reader.readLine());
        System.out.println("My name is "+name+ ".\nI was born on "+mm+ "/" +dd+ "/" +yyyy);
    }
}

