package com.company;


import java.io.FileNotFoundException;
import java.net.URISyntaxException;

/*
Exceptions. Just exceptions.
*/

public class two_exceptions {
    public static void main(String[] args) throws Exception {
        try
        {
            method1();
        }
        catch(NullPointerException e)
        {

        }
        catch(FileNotFoundException e)
        {

        }

    }

    public static void method1() throws NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException {
        int i = (int) (Math.random() * 4);
        if (i == 0)
            throw new NullPointerException();
        if (i == 1)
            throw new ArithmeticException();
        if (i == 2)
            throw new FileNotFoundException();
        if (i == 3)
            throw new URISyntaxException("", "");
    }
}
