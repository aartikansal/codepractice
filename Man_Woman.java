package com.company;

public class Man_Woman {
    public static void main(String[] args) {

        Man man1 = new Man("Ram",45,"Georgia");
        System.out.println(man1.name+" "+man1.age+" "+man1.address);
        Man man2 = new Man("Rick",56,"Puerto Rico");
        System.out.println(man2.name+" "+man2.age+" "+man2.address);

        Woman woman1 = new Woman("Rita",34,"Georgia");
        System.out.println(woman1.name+" "+woman1.age+" "+woman1.address);
        Woman woman2 = new Woman("Sheela",23,"Pennsylvania");
        System.out.println(woman2.name+" "+woman2.age+" "+woman2.address);

    }

    public static class Man{
        String name;
        int age;
        String address;
        public String toString() {
            return this.name + " " + this.age + " " + this.address;
        }
        public Man(){

        }
        public Man(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public Man(String name, int age)
        {
            this.name = name;
            this.age = age;
            this.address = "address";
        }
        public Man(String address)
        {
            this.name = "name";
            this.age = age;
            this.address = address;
        }

    }
    public static class Woman{

        String name;
        int age;
        String address;
        public String toString() {

            return this.name + " " + this.age + " " + this.address;

        }
        public Woman() {

        }

        public Woman(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public Woman(String name, int age)
        {
            this.name = name;
            this.age = age;
        }
        public Woman(String address)
        {
            this.address = address;

        }
    }

}

