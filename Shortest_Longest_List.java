package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Shortest_Longest_List {
    public static void main(String[] args) throws Exception {
                BufferedReader reader = new BufferedReader( new InputStreamReader(System.in) );
                ArrayList<String> list = new ArrayList<String>();

                for(int i = 0; i < 10; i++)
                    list.add(reader.readLine());

                //longest
                String lon = list.get(0);
                for(int i = 1; i < 5; i++)
                {
                    String s = list.get(i);
                    if( s.length() > lon.length() ) lon = list.get(i);
                }

                //Shortest
                String sho = list.get(0);
                for(int i = 1; i < 5; i++)
                {
                    String s = list.get(i);
                    if( s.length() < sho.length() ) sho = list.get(i);
                }

                for(int i = 0; i < list.size(); i++)
                {
                    if(list.get(i).length() == sho.length())
                    {
                        System.out.println(list.get(i));
                        break;
                    }

                    else if(list.get(i).length() == lon.length())
                    {
                        System.out.println(list.get(i));
                        break;
                    }

                }
            }
        }