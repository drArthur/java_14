package com.sda.lesson_4;

public class Example1 {
    public static void main(String[] args) {
        double value = 0.4;

        for (int i = 0; i < 100; i++) {
            //System.out.println(i);
            value += 0.2;
        }

        System.out.println(value);
    }
}
