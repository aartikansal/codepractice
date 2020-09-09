package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Increment_Odd {
    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int input = Integer.parseInt(br.readLine());

            while (input > 0) {
                if (input % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }

                input /= 10;
            }

            br.close();

            System.out.println("Even: " + even + " Odd: " + odd);
        }
    }


