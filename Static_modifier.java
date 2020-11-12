package com.company;





/*
Static modifiers are out of place

*/
public class Static_modifier {
    public int A = 5;
    public int B = 2 * A;
    public int C = A * B;
    public int D = A * B;

    public static void main(String[] args) {
        Solution room = new Solution();
        room.A = 5;

        Solution.D = 5;
    }

    public static int getA() {
        return A;
    }

}
