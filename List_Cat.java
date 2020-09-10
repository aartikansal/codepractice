package com.company;


import java.util.ArrayList;


public class List_Cat {

            public static ArrayList<Cat> cats = new ArrayList<Cat>();

            public List_Cat() {
            }
            public static void main(String[] args) {
                for (int i = 0; i < 10; i++) {
                    Cat cat = new Cat();
                    cats.add(cat);
                }
                printCats();
            }
            public static void printCats() {
                for (int i = 0; i < cats.size(); i++) {
                    System.out.println(cats.get(i));
                }
            }
        }
