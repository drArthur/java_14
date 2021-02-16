package com.sda.lesson_13;

import java.util.Scanner;

// Input number
// 10
// Fibonacci numbers from 0 to 10 are 1 + 1 + 2 + 3 + 5 +

public class Example1 {
    public static void main(String[] args) {
        //Scanner, user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number ");
        int n = sc.nextInt();

        // initializing variables for 2 elements
        int t1 = 0, t2 = 1;
        System.out.print("Fibonacci numbers from 0 to " +n + " are ");
        // outputting the two first elements
        // we could write the variables, but we already know
        // what they are, so we can just output them like this
        System.out.print(" 0, 1");

        // calculate the initial sum (0+1) = 1
        int sum = t1 + t2;
        // skip declaration and initialization,
        // because sum is already created.
        // but we still need to provide a "line" of code.
        // hence, we're using an empty ";"

        // while sum is smaller than n (i.e. 10)
        // calculate sum as the sum of t1 and t2
        for (; sum <= n; sum = t1 + t2) {
            // output the current sum (still in one line)
            System.out.print(", " + sum);
            // set t1 to t2
            t1 = t2;
            // set t2 to sum
            t2 = sum;
        }
        // newline
        System.out.println();

    }
}
