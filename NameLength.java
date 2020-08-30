package com.company;
import java.io.*;



    public class NameLength{
        public static void main(String[] args) throws Exception {
            //write your code here
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String name1 = reader.readLine();
            String name2 = reader.readLine();
            int x = name1.length();
            int y = name2.length();

            if(name1.equals(name2)){
                System.out.println("The names are identical");
            }
            else if (x == y){
                System.out.println("The names are the same length");
            }

        }

    }






