package com.company;
import java.io.*;

/*
Controlling body weight

*/

           public class Bmi {
           public static void main(String[] args) throws IOException {
               BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
               double weight = Double.parseDouble(br.readLine());
               double height = Double.parseDouble(br.readLine());

               Body.calculateBMI(weight, height);
           }

               public static class Body {
               public static void calculateBMI(double weight, double height) {
                       double bmi = weight / (height * height);
                       if (bmi < 18.5) {
                           System.out.println("Underweight: BMI < 18.5");
                       } else if (18.5 <= bmi && bmi < 25) {
                           System.out.println("Normal: 18.5 <= BMI < 25");
                       } else if (25 <= bmi && bmi < 30) {
                           System.out.println("Overweight: 25 <= BMI < 30");
                       } else if (bmi >= 30) {
                           System.out.println("Obese: BMI >= 30");
                       }
                   }
               }
           }


