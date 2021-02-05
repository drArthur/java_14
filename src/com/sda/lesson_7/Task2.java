package com.sda.lesson_7;

import java.util.Scanner;


//Write a program that takes a positive integer N - ​ n (​ int​ )​  from the user,
//and then displays all powers of the number 2 in the console that are not
//greater than the number given (each number should be displayed in
//new line.
//For example, for the number 71 the program should write in the console
//the numbers: 1 2 4 8 16 32 64, in new line each.
//Get the data from the user in the console using the ​ Scanner​  class.

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Please input number ");
        int num = sc.nextInt();
        int b = 1;

        for (int i = 1; b <= num; i++) {
            System.out.println(b);
            b = (int)Math.pow(2,i);
        }

        for(int i = 1; i <= num; i*=2)
            System.out.println(i);



    }
}
