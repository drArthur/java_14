package com.sda.lesson_6;

//Write a program that, based on the variables: height - ​ height (​ int​ )​  and
//weight - ​ weight (​ float​ )​ , checks whether a person can ride a roller coaster.
//If a person is taller than 150cm and does not exceed 180kg, the
//program will write in the console ​ "Fasten your seatbelt!"​ , Otherwise it
//will write in the console ​ "I'm sorry you can't go!"​ .
//Get the data from the user in the console using the ​ Scanner​  class.

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Height:");
        int height = input.nextInt();
        System.out.println("Weight:");
        float weight = input.nextFloat();

        if(height >= 150 && weight <= 180)
            System.out.println("Fasten your seatbelt!");
        else
            System.out.println("I'm sorry you can't go!");
    }
}
