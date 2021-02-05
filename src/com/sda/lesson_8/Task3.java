package com.sda.lesson_8;

//Write a guessing game where the user has to guess a secret number.
// After every guess the program tells the user whether
// their number was too large or too small.
// At the end the number of tries needed should be printed

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Try to guess number from 0 till 100");
        int n;
        Random random = new Random();
        int r = random.nextInt(100);
        int counter = 0;        // System.out.println(r);
        do {
            n = input.nextInt();
            if (n > r) System.out.println("Your number is too big");
            else if (n < r) System.out.println("Your number is too small");
            counter++;
        } while (n != r);
        System.out.println("Success! You have tried " + counter + " times");
    }
}
