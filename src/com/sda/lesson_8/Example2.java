package com.sda.lesson_8;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input ");
        String s = input.nextLine();

        switch(s) {
            case "up":
                System.out.println("Character's going up");
                break;
            case "down":
                System.out.println("Character's going down");
                break;
            case "left":
                System.out.println("Character's going left");
                break;
            case "right":
                System.out.println("Character's going right");
                break;
            case "jump":
                System.out.println("Character's jumping");
                break;
            default:
                System.out.println("Character's idle");
                break;
        }
    }
}
