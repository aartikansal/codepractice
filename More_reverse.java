package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class More_reverse {

    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[10];
        for(int i =0; i<10;i++)
        {
            array[i]= Integer.parseInt(br.readLine());
        }
        for(int i = 9; i>=0;i--)
        {
            System.out.println(array[i]);
        }
    }
}
// second program
    /*public static void main(String[] args)
    {
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);

// Read strings from the keyboard
        String[] list = new String[10];
        for (int i = 0; i < list.length; i++)
        {
            String s = reader.readLine();
            list[i] = s;
        }

// Display the contents of the array
        for (int i = 0; i < list.length; i++)
        {
            int j = list.length - i - 1;
            System.out.println( list[j] );
        }
    }*/