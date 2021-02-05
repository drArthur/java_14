package com.sda.lesson_8;

import java.util.Scanner;

//Write a program that takes an integer greater than 1 from the user and
//checks if the number is a prime number. In the case when this number
//is a prime number, the program will write a message ​ "Yes"​  in the
//console, otherwise it will write a message ​ "No"​  in the console.
//If the user gives a number less than or equal to 1, the program will write
//in the console the message: ​ "I am interrupting work"​   Get the data from
//the user in the console using the ​ Scanner​  class.

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number;
        do {
            number = input.nextInt();
            if (number <= 1) break;
            if (isPrime(number)) System.out.println("Yes");
            else System.out.println("No");
        } while (true);
        System.out.println("I am interrupting work");
    }

    public static boolean isPrime(int number) {
        if (number > 2 && number % 2 == 0) return false;
        if (number == 2 || number == 3) return true;
        for (int i = 3; i < number / 2; i += 2) if (number % i == 0) return false;
        return true;
    }
}
