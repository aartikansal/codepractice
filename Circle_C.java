package com.company;

public class Circle_C {

    public double x;
    public double y;
    public double radius;

    public Circle_C(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle_C(double x, double y) {
        this (x, y, 10);

    }

    public Circle_C() {
        this(5, 5, 1);
    }

    public static void main(String[] args) {
        Circle_C circle = new Circle_C();
        System.out.println(circle.x + " " + circle.y + " " + circle.radius);
        Circle_C anotherCircle = new Circle_C(10, 5);
        System.out.println(anotherCircle.x + " " + anotherCircle.y + " " + anotherCircle.radius);
    }
}

