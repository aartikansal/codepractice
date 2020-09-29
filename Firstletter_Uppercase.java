package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Firstletter_Uppercase {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        String[] string = s.split("\\s+");

        for(int i = 0; i < string.length; i++){
            String word = string[i];
            System.out.print(word.substring(0, 1).toUpperCase() + word.substring(1)+" ");


        }
    }
}
