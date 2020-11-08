package com.company;

import java.io.CharConversionException;
import java.io.IOException;
import java.nio.file.FileSystemException;

/*
Catching custom exceptions
*/

public class Custom_exceptions {
    public static StatelessBean BEAN = new StatelessBean();

    public static void main(String[] args) {
        try{
            handleExceptions();
        }
        catch(Exception e){
            BEAN.log(e);
            throw e;
        }
    }

    public static void handleExceptions() {
        try{
            BEAN.throwExceptions();
        }
        catch(FileSystemException e)
        {

        }
        catch(IOException e){
            BEAN.log(e);
        }

    }

    public static class StatelessBean {
        public void log(Exception exception) {
            System.out.println(exception.getMessage() + ", " + exception.getClass().getSimpleName());
        }

        public void throwExceptions() throws CharConversionException, FileSystemException, IOException {
            int i = (int) (Math.random() * 3);
            if (i == 0)
                throw new CharConversionException();
            if (i == 1)
                throw new FileSystemException("");
            if (i == 2)
                throw new IOException();
        }
    }
}
