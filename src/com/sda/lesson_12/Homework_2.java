package com.sda.lesson_12;

import java.util.Arrays;

//Write a Java program to reverse an array of integer values.
public class Homework_2 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int[] array2 = new int[array.length];

        for(int i = 0; i < array.length; i++)
            array2[array.length-i-1] = array[i];

        System.out.println(Arrays.toString(array2));
    }
}
