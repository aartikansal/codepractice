package com.company;

/*
Dividing by zero
*/

public class Zero_Exception {

    public static void main(String[] args) {
        try
        {
            divideByZero();
        }
        catch(ArithmeticException e)
        {e.printStackTrace();
            //System.out.println("ArithmeticException has been caught.");
            //printStackTrace(e);
        }
    }
    public static void divideByZero()
    {
        int  a = 3;
        int result = a / 0;
        System.out.println(result);
    }
    public static void printStackTrace(Throwable throwable)
    {
        for(StackTraceElement element : throwable.getStackTrace())
        {
            System.out.println(element);
        }

    }
}
