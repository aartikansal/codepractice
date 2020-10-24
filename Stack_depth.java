package com.company;

/*
In the blue depths of the stack trace…
*/

public class Stack_depth {
    public static void main(String[] args) throws Exception {
        int deep = getStackTraceDepth();
    }

    public static int getStackTraceDepth() {
        StackTraceElement[] element = Thread.currentThread().getStackTrace();
        System.out.print(element.length);
        return element.length;
    }
}

