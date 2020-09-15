package com.company;

public class DollarPattern {
    public static void main(String[] args) throws Exception {


        int i = 1;
        int j = 1;
        while (i <= 10) {
            while (j <= 10) {
                System.out.print("$");
                j++;
            }
            System.out.println(" ");
            j = 1;
            i++;
        }
    }
}
         //alternate for loop
        /*for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("$");
            }
            System.out.println(" ");
        }
    }
}*/











