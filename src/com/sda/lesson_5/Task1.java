package com.sda.lesson_5;

import java.util.Scanner;

public class Task1 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Please write which value to find ");

            int n = input.nextInt();

            int[] array = new int[]{20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};


            for (int i=0; i < array.length; i++) {
                if (array[i]==n) {
                    System.out.println("Found n at " +i +"element");
                    break;
                }

            }


        }

}
