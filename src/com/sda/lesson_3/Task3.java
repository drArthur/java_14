package com.sda.lesson_3;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //fahrenheit to celcius converter
        //formula: (x − 32) × 5/9

        System.out.println("Input temperature in F: ");
        double x = input.nextDouble();
        double celsius = (x - 32) * 5 / 9;

        //without formatting
        System.out.println( celsius + " C");

        //2 decimal places
        System.out.println( String.format("%,.2f", celsius) + " C");

        //4 decimal places
        System.out.println( String.format("%,.4f", celsius) + " C");

    }
}
