package com.company;

public class Catch_Thread {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            }
            catch(Exception e){
            }

        }
    }
}
