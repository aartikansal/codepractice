package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


            public class Max_Print {
            public static int max = 100;
            public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String max = "The max is ";
            int a = Integer.parseInt(reader.readLine());
            int b = Integer.parseInt(reader.readLine());
            max += a > b ? a : b;
            //max += Math.max(a, b);(can be replaced by this line of code, math function)
            System.out.println(max);
               }
            }

