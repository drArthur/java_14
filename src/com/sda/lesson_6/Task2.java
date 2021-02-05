package com.sda.lesson_6;

//Write a program that, based on the variable: ​ income (​ double​ )​ , will
//calculate the amount of personal income tax due and write it to the
//console.
//The tax is calculated according to the following rules:
//• up to 85,528.00 tax is 18% of the base minus 556.02,
//• from 85,528.00 tax is 14,839.02 + 32% of the surplus over
//85,528.00.
//Get the income from the user in the console using the ​ Scanner​  class.

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your income before tax:");
        double income = input.nextDouble();

        if (income < 85_528) {
            System.out.println(String.format("%.2f", basic(income)));
        } else {
            System.out.println(String.format("%.2f", great(income)));
        }
    }

    public static double basic(double money) {
        return (money * 0.18) - 556.02;
    }

    public static double great(double bigIncome) {
        double basicTax = basic(85_528);
        return ((bigIncome - 85_528) * 0.32) + basicTax;
    }
}
