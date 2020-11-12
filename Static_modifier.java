package com.company;





/*
Static modifiers are out of place

*/
public class Static_modifier {
    public static int a = 5;
    public static int B = 2 * a;
    public int C = a * B;
    public static int D = a * B;

    public static void main(String[] args) {
        Solution room = new Solution();
        room.a = 5;

        Solution.d = 5;
    }

    public int geta() {
        return a ;
    }

}