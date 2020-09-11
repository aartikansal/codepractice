package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Family {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String grandfatherName = reader.readLine();
        Cat catGrandfather = new Cat(grandfatherName);

        String grandmotherName = reader.readLine();
        Cat catGrandmother = new Cat(grandmotherName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother);

        System.out.println(catGrandfather);
        System.out.println(catGrandmother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);

    }

    public static class Cat {
        private String name;
        private Cat father;
        private Cat mother;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat father, Cat mother) {
            this.name = name;
            this.father = father;
            this.mother = mother;
        }

        public Cat(String sonName, Cat catMother) {

        }

       /* @Override
        //public String toString() {
            if (parent == null)
                return "The cat's name is " + name + ", no mother ";
            else
                return "The cat's name is " + name + ", " + parent.name + " is the mother";
        }*/
    }

}
