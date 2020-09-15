package com.company;




import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Longest string

*/

        public class Longest_String_List {
            private static List<String> strings;

            public static void main(String[] args) throws Exception {
                strings= new ArrayList<String>();
                String temp;
                int max=0;
                Scanner sc=new Scanner(System.in);
                for(int i=0;i<5;i++){
                    temp=sc.nextLine();
                    strings.add(temp);
                    if(max<temp.length()){
                        max=temp.length();
                    }
                }

                for(int i=0;i<5;i++){

                    if(max==strings.get(i).length())
                        System.out.println(strings.get(i));

                }

            }
        }
