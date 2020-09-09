package com.company;

public class Util {
    
        public static double getDistance(int x1, int y1, int x2, int y2) {
            //write your code here
            int x = x1 - x2 ;
            int y = y1 - y2 ;
            double z = (x * x ) + ( y * y );
            z = Math.sqrt(z);
            return z;
        }

        public static void main(String[] args) {

            Util.getDistance(2,4,6,8);
        }
    }
