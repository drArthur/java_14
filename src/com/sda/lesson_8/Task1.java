package com.sda.lesson_8;


//Create an enum "Animals"
//with a frog, cat and a dog
//create a switch that outputs
//what sounds they make

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What animal is is?");
        Animal sound = Animal.valueOf(input.nextLine().toUpperCase());

        switch (sound) {
            case CAT:
                System.out.println("Meow");
                break;
            case COW:
                System.out.println("Moo");
                break;
            case DOG:
                System.out.println("Bark");
                break;
            case FROG:
                System.out.println("Croak");
                break;
            case HORSE:
                System.out.println("Neigh");
                break;
            default:
                System.out.println("We don't recognise it!");
                break;

        }
    }
}
