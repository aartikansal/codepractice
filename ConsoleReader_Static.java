package com.company;




import java.util.Scanner;

public class ConsoleReader_Static {
    public static String readString() throws Exception {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        return a;

    }

    public static int readInt() throws Exception {
        Scanner input = new Scanner (System.in);
        int b = input.nextInt();
        return b;


    }

    public static double readDouble() throws Exception {
        Scanner c = new Scanner(System.in);
        double d = c.nextDouble();
        return d;


    }

    public static boolean readBoolean() throws Exception {
        Scanner input = new Scanner(System.in);
        Boolean r = input.nextBoolean();
        return r;

    }

    public static void main(String[] args) {

    }
}
