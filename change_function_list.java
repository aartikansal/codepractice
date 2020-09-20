package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class change_function_list {
        public static void main(String[] args) throws IOException {
            Scanner s=new Scanner(System.in);

            ArrayList<String> list = new ArrayList<String>();
            while (true) {
                String c = s.nextLine();
                if (c.isEmpty()) break;
                list.add(c);
            }
            for (int count=0;count<list.size();count++){
                if (list.get(count).length()%2==0)
                    System.out.println(list.get(count)+" "+list.get(count));
                else
                    System.out.println(list.get(count)+" "+list.get(count)+" "+list.get(count));
            }
        }
}
