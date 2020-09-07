package com.company;




public class Dog_Constructor {
    String name;
    String color;
    int height;

    public Dog_Constructor(String name)
    {
        this.name = name;
    }

    public Dog_Constructor(String name, int height)
    {
        this.name = name;
        this.height = height;
    }
    public Dog_Constructor(String name, int height, String color)
    {
        this.name = name;
        this.height = height;
        this.color = color;
    }
    public static void main(String[] args) {

    }
}


