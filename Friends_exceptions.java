package com.company;

public class Friends_exceptions {
    public static void main(String[] args) throws MyException {
        method1();
    }
        public static void method1() throws MyException, MyException2, MyException3, MyException4 {
            int i = (int) (Math.random() * 4);
            if (i == 0) throw new MyException();
            if (i == 1) throw new MyException2();
            if (i == 2) throw new MyException3();
            if (i == 3) throw new MyException4();

        }

        static class MyException extends Exception {
        }

        static class MyException2 extends MyException {
        }

        static class MyException3 extends RuntimeException {   //RuntimeException()
        }

        static class MyException4 extends MyException3 {
        }
    }


