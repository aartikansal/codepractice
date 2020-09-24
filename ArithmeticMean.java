package com.company;
import java.io.*;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
    public class ArithmeticMean {
        public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);
            //boolean flag = true;
            double count = 0;
            double sum = 0;

            while(true){
                double num = sc.nextDouble();

                if(num != -1) {
                    sum += num;
                    count++;
                }
                    else {
                    System.out.println(sum / count);
                    break;
                }
                }
            }
        }



