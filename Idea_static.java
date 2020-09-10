package com.company;

public class Idea_static {

    public static void main(String[] args) {
        printIdea(new Idea());
    }

    //write your code here
    public static void printIdea(Idea idea){
        System.out.println(idea.getDescription());
    }
    public static class Idea{
        public String getDescription(){
            String s = "AA";
            return s;
        }
    }
}