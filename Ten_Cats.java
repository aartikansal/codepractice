package com.company;

public class Ten_Cats {
    public static void main(String[] args) {

        for(int i=0; i <10; i++)
        {
            Cat cat = new Cat();
        }
        System.out.println(Cat.catCount);


    }

    public static class Cat {


        static public int catCount =0;
        public Cat()
        {
            catCount++;
        }
        
    }
}
