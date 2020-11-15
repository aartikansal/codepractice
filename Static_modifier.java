package com.company;

/*
Static modifiers are out of place
*/
public class Static_modifier {
    public  static int A = 5;
    public  static int B = 2 * A;
    public int C = A * B;
    public  static int D = A * B;

    public static void main(String[] args) {
        Static_modifier room = new Static_modifier();
        room.A = 5;
        Static_modifier.D = 5;
    }

    public int getA() {
        return A;
    }

}