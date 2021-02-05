package com.sda.lesson_8;


import java.util.Scanner;

// Write a function called FooBar that takes input integer n and prints all the numbers
// from 1 up to n in a new line.
// If the number is divisible by 3 then print "Foo", if the number is divisible by 5 then print "Bar"
// and if the number is divisible by both 3 and 5, print "FooBar".
// Otherwise just print the number.
public class Task4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int n = input.nextInt();
        foobar(n);
    }

    public static void foobar(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("FooBar");
            else if (i % 3 == 0)
                System.out.println("Foo");
            else if (i % 5 == 0)
                System.out.println("Bar");
            else
                System.out.println(i);
        }
    }
}
