package com.sda.lesson_3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("write a number: ");

        double d = input.nextDouble();
        d *= 100;

        System.out.println("d * 100 = " + d);

        System.out.print("d * 100 = ");
        System.out.println(d);
    }
}
