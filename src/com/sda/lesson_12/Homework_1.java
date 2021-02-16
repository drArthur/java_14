package com.sda.lesson_12;

//Write a Java program to calculate the average value of array elements
public class Homework_1 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;

        for(int i : array)
            sum += i;

        System.out.println("The average of array is: " + sum / (double)array.length);
    }
}
