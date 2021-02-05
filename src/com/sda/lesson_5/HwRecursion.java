package com.sda.lesson_5;

import java.util.Scanner;

public class HwRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number!");
        int num = input.nextInt();
        System.out.println(fibonacci(num));
    }

    public static long fibonacci(int limit) {
        return fib(0,1,limit);
    }
    public static long fib(long a, long b, int limit) {
        System.out.println(a);
        if(limit == 1)
            return a;
        long f = fib(b, a+b, limit-1);
        //System.out.println(f);
        return f;
    }
}
