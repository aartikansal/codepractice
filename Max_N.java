package com.company;

import java.io.*;

            public class Max_N {
            public static void main(String[] args) throws Exception {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                int maximum = 0;
                int N = Integer.parseInt(reader.readLine());//reads a number N
                if (N > 0) {
                    maximum = Integer.parseInt(reader.readLine());
                    for (int i = 1; i < N; i++) {   //length is N
                        maximum = Math.max(maximum, Integer.parseInt(reader.readLine()));
                    }
                    System.out.println(maximum);
                }
            }
        }

