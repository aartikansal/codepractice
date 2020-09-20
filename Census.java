package com.company;

/*
Family census

*/
public class Census {
        public static void main(String[] args) {

           // Human Papa = new Human("papa",true,50);
            //Human Mummy = new Human("mummy",false,50);

            Human h1 = new Human("Aarti",false, 22);
            Human h2 = new Human("Aarti1",false, 21);
            Human h3 = new Human("Aarti2",false, 23);
            Human h4 = new Human("Aarti3",false, 24);
            Human h5 = new Human("Aarti4",false, 25, h1.father, h1.mother);
            Human h6 = new Human("Aarti5",false, 26,h2.father,h2.mother);
            Human h7 = new Human("Aarti6",false, 27,h3.father,h3.mother);
            Human h8 = new Human("Aarti7",false, 28,h4.father,h5.mother);
            Human h9 = new Human("Aarti8",false, 29,h5.father,h5.mother);
            System.out.println(h1);
            System.out.println(h2);
            System.out.println(h3);
            System.out.println(h4);
            System.out.println(h5.toString());
            System.out.println(h6.toString());
            System.out.println(h7.toString());
            System.out.println(h8.toString());
            System.out.println(h9.toString());
        }

        public static class Human {
            // write your code here
            String name;
            boolean sex;
            int age;
            Human father;
            Human mother;

           public Human(String name, boolean sex, int age)
            {
                this.name=name;
                this.sex=sex;
                this.age=age;
            }

           public Human(String name, boolean sex, int age, Human father, Human mother)
            {
                this.name=name;
                this.sex=sex;
                this.age=age;
                this.father=father;
                this.mother=mother;
            }

            public String toString() {
                String text = "";
                text += "Name: " + this.name;
                text += ", sex: " + (this.sex ? "male" : "female");
                text += ", age: " + this.age;

                if (this.father != null)
                    text += ", father: " + this.father.name;

                if (this.mother != null)
                    text += ", mother: " + this.mother.name;

                return text;
            }
        }
    }




















