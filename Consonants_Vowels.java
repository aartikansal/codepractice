package com.company;




import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Vowels and consonants
*/

public class Consonants_Vowels {
    public static char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] inserted = reader.readLine().toCharArray();
        char space = ' ';
        ArrayList<String> vowelsArr = new ArrayList<>();
        ArrayList<String> consonantArr = new ArrayList<>();
        for (int i = 0; i <inserted.length; i++) {
            if(inserted[i]== space) continue;
            else if(isVowel(inserted[i])){
                vowelsArr.add(String.valueOf(inserted[i]));
            }
            else consonantArr.add(String.valueOf(inserted[i]));
        }
        for (String vow:vowelsArr)
         {
            System.out.print(vow + " ");
        }
        System.out.print("\n");
        for (String consonant:consonantArr)
         {
            System.out.print(consonant  + " ");
        }
    }
    

    // The method checks whether a letter is a vowel
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // Convert to lowercase

        for (char d : vowels)   // Look for vowels in the array
        {
            if (c == d)
                return true;
        }
        return false;
    }
}