package com.sda.lesson_6;

public class Example4 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 8) {
                continue;
            }
            System.out.println("Hello World! " + i);
        }
    }
}
