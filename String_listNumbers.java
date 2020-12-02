package com.company;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Number of letters
*/

public class String_listNumbers {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Alphabet
        String abc = "abcdefghijklmnopqrstuvwxyz";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<>();
        for (char letter : abcArray) {
            alphabet.add(letter);
        }

        // Read in strings
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        // write your code here
        int[] count = new int[alphabet.size()];
        for (String s : list) {
            for (char c : s.toCharArray()) {
                int index = alphabet.indexOf(c);
                if (index < 0) continue;

                count[index]++;
            }
        }

    }

}
