package com.sda.lesson_6;

public class Example1 {
    public static void main(String[] args) {
        int num = 5;
        int i = 2;
        num = num + i++;
        System.out.println(num++);
        System.out.println(num);
        System.out.println(i);
        num = 5;
        System.out.println(++num);
        System.out.println();

        i = 0;
        System.out.println(i++);
        System.out.println(i++);
    }
}
