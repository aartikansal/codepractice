package com.company;
import java.io.*;

public class SortThree {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a = bufferedReader.readLine();
        String b = bufferedReader.readLine();
        String c = bufferedReader.readLine();

        int max = Integer.parseInt(a);
        int mid = Integer.parseInt(b);
        int min = Integer.parseInt(c);
        int temp = 0;

        for(int i=0; i<3;i++)
        {
            if (max>mid&&max>min) {
                if (mid > min) {
                    break;
                } else {
                    temp = mid;
                    mid = min;
                    min = temp;
                    break;
                }
            }
            else {
                temp = max;
                max = mid;
                mid = min;
                min = temp;
            }
        }
        System.out.println(min+" "+mid+" "+max);
    }
}






