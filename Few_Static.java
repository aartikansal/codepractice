package com.company;
/*
Use the fewest number of static modifiers
*/

public class Few_Static {
    public int A = 5;
    public static int B = 5;
    public static int C = 5;
    public static int D = 5;

    public static void main(String[] args) {
        Few_Static few_static = new Few_Static();
        few_static.A = 5;
        few_static.B = 5 * B;
        few_static.C = 5 * C * D;
        Few_Static.D = 5 * D * C;

        Few_Static.D = 5;
    }

    public int getA() {
        return A;
    }

}
