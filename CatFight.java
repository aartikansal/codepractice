package com.company;

public class CatFight {

    public static void main(String[] args) {
        //write your code here
        Cat cat1 = new Cat("Tyler", 7, 15, 4);
        Cat cat2 = new Cat("Ray", 6, 19,5);
        Cat cat3 = new Cat("Rosie",3,10,3);

        System.out.println(cat2.fight(cat1));
        System.out.println(cat2.fight(cat3));
        System.out.println(cat3.fight(cat1));


    }

    public static class Cat {
        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageAdvantage = this.age > anotherCat.age ? 1 : 0;
            int weightAdvantage = this.weight > anotherCat.weight ? 1 : 0;
            int strengthAdvantage = this.strength > anotherCat.strength ? 1 : 0;

            int score = ageAdvantage + weightAdvantage + strengthAdvantage;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}
