package com.company;

import java.io.IOException;
import java.rmi.RemoteException;

/*
Catching checked exceptions

*/

public class Checked_exception {
    public static void main(String[] args) {
        handleExceptions(new Solution());

    }

    public static void handleExceptions(Solution obj) {
        int i = 1;
        while (i <= 3) {
            try {
                if (i == 1)
                    obj.method1();
                else if (i == 2)
                    obj.method2();
                else if (i == 3)
                    obj.method3();
            } catch (Exception e) {
                System.out.println(e);
            }
            i++;
        }
    }

        public void method1 () throws IOException {
            throw new IOException();
        }

        public void method2 () throws NoSuchFieldException {
            throw new NoSuchFieldException();
        }

        public void method3 () throws RemoteException {
            throw new RemoteException();
        }
    }

