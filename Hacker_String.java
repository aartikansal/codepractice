
import java.io.*;
import java.util.*;

public class Hacker_String {

        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            String A=sc.next();
            String B=sc.next();
            /* Enter your code here. Print output to STDOUT. */
            String output = "No";
            System.out.println(A.length()+B.length());
            if(A.compareTo(B)>0)
            {
                output ="Yes";
            }

            //System.out.println(output);
            //System.out.println(A.substring(0, 1).toUpperCase()+""+A.substring(1)+" "+
                   // B.substring(0, 1).toUpperCase()+""+B.substring(1));

            System.out.println(A.substring(0, 1).toUpperCase());
            System.out.println(A.substring(1));
            System.out.println(B.substring(0, 1).toUpperCase());
            System.out.println(B.substring(1));
        }
        }




