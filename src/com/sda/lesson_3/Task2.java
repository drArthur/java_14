package com.sda.lesson_3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input an integer: ");

        int i = input.nextInt();
        int i_copy = i;

        //Showing off variables, multiplication
        System.out.println("\nMethod 1 - i*i :");
        int iSquared = i*i;
        System.out.println(i + " squared = " + iSquared);

        //Showing off the assignment operators
        System.out.println("\nMethod 2 - i*=i");
        i *= i;
        System.out.println(i);

        //We will look into this later on
        //No need to remember yet
        System.out.println("\nMethod 3 - Math.pow(i,2)");
        System.out.println((int)Math.pow(i_copy,2));
    }
}
