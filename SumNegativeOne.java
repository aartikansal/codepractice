package com.company;
import java.io.*;
import java.util.Scanner;

public class SumNegativeOne {
    public static void main(String[] args) throws Exception {

        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int num = 0;
        Scanner  in    = new Scanner(System.in);
        while (in.hasNextLine()){
            num = in.nextInt() ;
            sum = sum + num;
            if(num == -1) {
                    break;
                }
            }
        System.out.println(sum);
    }
}
