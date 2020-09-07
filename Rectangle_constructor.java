package com.company;

public class Rectangle_constructor {

    int top;
    int left;
    int width;
    int height;

    public Rectangle_constructor(int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;

    }

    public Rectangle_constructor(int top, int left, int width) {
        this.top = top;
        this.left = left;
        this.width = width;
    }

    public Rectangle_constructor(int left, int height) {
        this.left = left;
        this.height = height;
    }

    public Rectangle_constructor(int top) {
        this.top = top;
    }

    public static void main(String[] args) {
    }
}