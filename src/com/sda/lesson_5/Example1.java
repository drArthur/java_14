package com.sda.lesson_5;

public class Example1 {
    public static void main(String[] args) {
        System.out.println(dog(1));
    }

    public static int dog(int n) {
        if( n == 5)
            return n;
        System.out.println(n);
        int x = dog(n+1);
        System.out.println("n = " + n);
        return x;
    }
}
