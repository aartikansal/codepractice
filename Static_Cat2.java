package com.company;

public class Static_Cat2 {

        private static int catCount = 0;

        public Static_Cat2() {
            catCount++;
        }

        public static int getCatCount() {
            Static_Cat2.catCount = catCount;
            return catCount;

        }

        public static void setCatCount(int catCount) {
            Static_Cat2.catCount = catCount;
        }

        public static void main(String[] args) {

        }
    }

