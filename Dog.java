package com.company;

public class Dog {
        //write your code here
        String name;
        int age;

        public String getName()
        {
            return name;
        }
        public void  setName(String name)

        {
            this.name = name;

        }
        public int getAge()
        {
            return age;
        }

        public void setAge(int age)
        {
            this.age = age;
        }
        public static void main(String[] args) {
            Dog dog = new Dog();
            dog.name = "Rosie";
            dog.age = 4;

        }
    }

