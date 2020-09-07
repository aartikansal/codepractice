package com.company;

public class RedCircle {

        public Color color;


        public static void main(String[] args) {
            RedCircle circle = new RedCircle();
            circle.color.setDescription("Red");
            System.out.println(circle.color.getDescription());
        }

        public RedCircle() {
            color = new Color();
        }

        public class Color {
            String description;

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }
        }
    }
