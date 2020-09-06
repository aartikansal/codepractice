package com.company;

public class Cats {

    public static void main(String[] args) {
        //write your code here
        Cat cat1=  new Cat("Rosie",5,14, 6);
        Cat cat2 = new Cat("Tyler", 6, 17, 7);
        Cat cat3 = new Cat("Ray",3, 15, 8);

    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}