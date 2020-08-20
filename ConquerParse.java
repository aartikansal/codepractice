package com.company;
import java.io.*;

        public class ConquerParse {
        public static void main(String[] args) throws Exception {
            //write your code here
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String sAge = reader.readLine();
            String name = reader.readLine();
            int nAge = Integer.parseInt(sAge);
            System.out.println(name+" will take over the world in "+sAge+ " years. Mwa-ha-ha!");

        }
    }


