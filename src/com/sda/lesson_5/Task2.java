package com.sda.lesson_5;

import java.util.Scanner;

public class Task2 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Input a number");
            int n = input.nextInt();
            boolean isPrime = true;
            if(n > 1 && n % 2 ==0) isPrime=false;

            else {
                for(int i = 3; i < n/2; i+=2) {
                    if (n % i == 0) {
                        isPrime = false;
                        break;
                    }
                }

            }

            if(isPrime)
                System.out.println("n is Prime");

            else
                System.out.println("n isn't Prime");
        }

}
