package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Family {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandFather = reader.readLine();
        Cat catGrandFather = new Cat(grandFather);

        String grandMother = reader.readLine();
        Cat catGrandMother = new Cat(grandMother);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, null, catGrandFather);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName,catGrandMother,null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother , catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother,  catFather);

        System.out.println(catGrandFather);
        System.out.println(catGrandMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name) {
            this.name = name;
        }
        Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        @Override
        public String toString() {
            if (mother == null && father != null)
                return "The cat's name is " + name + ", no mother, "+ this.father.name+ " is the father";
            else  if (father == null && mother != null)
                return "The cat's name is " + name +", "+this.mother.name + " is the mother, " + "no father ";
            else if (father != null && mother != null)
                return "The cat's name is " + name + ", "+ this.mother.name+ " is the mother, "+ this.father.name + " is the father";
            else
                return "The cat's name is " + name + ","+ " no mother, no father";
        }
    }

}