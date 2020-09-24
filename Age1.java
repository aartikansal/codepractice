package com.company;
import java.io.*;
public class Age1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String b = br.readLine();
        int c = Integer.parseInt(b);

        if (c > 20) {
            System.out.println("18 is old enough");
        }
    }
}
