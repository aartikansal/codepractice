package com.company;

import java.util.Scanner;

public class PiggyBank {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner input = new Scanner(System.in);

        int sum = 0;

        while (true) {
            String exit = input.nextLine();

            if (exit.equals("sum")) {
                break;
            }
            else {
                int num = Integer.parseInt(exit);
                sum += num;
            }
        }
        System.out.println(sum);

    }
}

