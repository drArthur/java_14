package com.sda.lesson_4;

public class Example2 {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println((int)Math.pow(2,3));
        System.out.println(Math.sqrt(4));
        System.out.println(Math.random());


        for (int i = 0; i < 100; i++) {
            System.out.println(randInt(-10, 10));
        }

    }

    public static int randInt(int min, int max) {
        return (int)randDouble(min, max);
    }

    public static double randDouble(double min, double max) {
        return Math.random() * ((max - min) + 1) + min;
    }

}
