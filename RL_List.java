package com.company;
import java.util.ArrayList;

public class RL_List {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("rose"); // 0
        list.add("love"); // 1
        list.add("lyre"); // 2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        for(int i=0;i<list.size();i++){
            String s=list.get(i);
              if(s.contains("l")){
                 list.add(i,s);
                 i++;
             }

            else if(s.contains("l")&&s.contains("r"))
            {}
            if(s.contains("r")){
                list.remove(i);
                i--;
            }
        }
        return list;
    }
}







