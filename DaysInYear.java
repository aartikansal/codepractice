package com.company;
import java.io.*;

public class DaysInYear {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String b=reader.readLine();
        int a=Integer.parseInt(b);
        if( a % 4 == 0 && (a % 400 == 0 || a % 100 != 0 ))
        {
            System.out.println("Number of days in the year: 366" );
        }
        else
        {
            System.out.println("Number of days in the year: 365");
        }

    }
}



