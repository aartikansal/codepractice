package com.company;

public class InitializerCat {

        private String name;
        private int weight;
        private int age;
        private String color;
        private String address;

        public void initialize(String name) {
            this.name = name;
            this.age = 7;
            this.weight = 8;
            this.color = "Rose";
            this.address = null;
        }

        public void initialize(String name, int weight, int age) {
            this.name = name;
            this.weight = weight;
            this.age = age;
            this.color = "Brown";
            this.address = null;
        }

        public void initialize(String name, int age) {
            this.name = name;
            this.age = age;
            this.weight = 20;
            this.color = "Pink";
            this.address = null;
        }

        public void initialize(int weight, String color) {
            this.weight = weight;
            this.color = color;
            this.age = 25;
            this.address = null;
            this.name = null;

        }

        public void initialize(int weight, String color, String address) {
            this.weight = weight;
            this.color = color;
            this.address = address;
            this.age = 30;
            this.name = null;
        }

        public static void main(String[] args) {


        }
    }


