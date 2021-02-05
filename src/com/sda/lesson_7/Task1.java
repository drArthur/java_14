package com.sda.lesson_7;

//Write a program that takes a positive integer from the user - ​ number
//(​ int​ )​ , and then prints all positive odd numbers not greater than the given
//number in the console in order, each number in new line.
//For example, for the number 15, the program should write in the
//console the numbers: 1, 3, 5, 7, 9, 11, 13, 15 (in new line each)

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Please input number ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) System.out.println(i);
        }

        for (int i = 1; i <= num; i += 2) System.out.println(i);
    }

}
