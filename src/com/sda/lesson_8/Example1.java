package com.sda.lesson_8;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Input water's temperature:");
        int temperature = input.nextInt();

        switch (temperature) {
            case 0:
                System.out.println("Water's starting to freeze!");
                break;
            case 100:
                System.out.println("Water's starting to boil!");
                break;
            case 6093:
                System.out.println("Water's becoming plasma!");
                break;
            default:
                if(temperature < 0)
                    System.out.println("Water's freezing!");
                else if (temperature < 100)
                    System.out.println("Everything's as usual!");
                else if (temperature < 6093)
                    System.out.println("Water's evaporated!");
                else
                    System.out.println("Water's plasma now!");
                break;
        }

    }

}
