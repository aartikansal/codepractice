package com.company;



public class Rectangle {
    private int top;
    private int left;
    private int width;
    private int height;

    public void initialize(int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;

    }

    public void initialize(int top, int left, int width) {
        this.top = top;
        this.left = left;
        this.width = width;
    }

    public void initialize(int left, int height) {
        this.left = left;
        this.height = height;
    }

    public void initialize(int top) {
        this.top = top;
    }

    public static void main(String[] args) {
    }
}