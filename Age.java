package com.company;


    import java.util.Scanner;
import java.io.*;

        public class Age{
        public static void main(String[] args) throws Exception {
            //write your code here
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String a = br.readLine();
            String b = br.readLine();

            int c = Integer.parseInt(b);

            if(c < 18)
            {
                System.out.println("Grow up a little more");
            }


        }
    }

