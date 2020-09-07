package com.company;


public class Cat_constructor {
    String name;
    int age;
    int weight;
    String address;
    String color;

    public Cat_constructor(String name)
    {
        this.name = name;
        this.address = null;
        this.age = 6;
        this.weight= 12;
        this.color = "Tan";

    }
    public Cat_constructor(String name, int weight, int age)
    {
        this.name= name;
        this.weight = weight;
        this.age = age;
        this.address = null;
        this.color = "Brown";

    }
    public Cat_constructor(int weight, String color)
    {
        this.weight = weight;
        this.color = color;
        this.name = null;
        this.address = null;
        this.age = 7;

    }
    public Cat_constructor(String name, int age)
    {
        this.address = null;
        this.name = name;
        this.age = age;
        this.color = "White";
        this.weight = 7;

    }
    public Cat_constructor(int weight, String color, String address)
    {
        this.name = null;
        this.age = 8;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}

