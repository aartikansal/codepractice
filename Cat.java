package com.company;
public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //write your code here
        if((this.strength>anotherCat.strength)&&(this.weight>anotherCat.weight)&&(this.age>anotherCat.age)){
            return true;
        }
        else
            return false;

    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        cat1.strength=20;
        cat1.age=5;
        cat1.weight=20;
        cat2.age=10;
        cat2.weight=15;
        cat2.strength=13;
        System.out.println(cat2.fight(cat1));
        System.out.println(cat2.fight(cat1));
    }
}