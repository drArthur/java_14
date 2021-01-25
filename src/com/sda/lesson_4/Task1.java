package com.sda.lesson_4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Write a program that rolls a dice
        //as many times as the user wants


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter random number:");

        int times = input.nextInt();

        for (int i = 0; i < times; i++) {
            System.out.println("This is try number " + i);
            System.out.println(Example2.randInt(1, 6));

        }


    }
}
