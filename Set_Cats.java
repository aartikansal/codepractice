package com.company;

import java.util.HashSet;
import java.util.Set;

/*
Set of cats
*/
    public class Set_Cats {
    public static class Cat {
        public Cat() {
        }
    }
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        for (Cat cat : cats) {
            cats.remove(cat);
            break;
        }

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> set = new HashSet<Cat>();
        set.add(new Cat());
        set.add(new Cat());
        set.add(new Cat());
        return set;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat cat : cats) {
            System.out.println(cats);
        }
    }
}


