package com.sda.lesson_12;

import java.util.Arrays;

// Given an array and a number k where k is smaller than size of array,
// we need to find the k’th smallest element in the given array.
public class Homework_4 {
    public static void main(String[] args) {
        int[] array = {100,132,21,300,-423,45,7,1,90,756,5,6,7,8,9,10};
        int k = 3;
        Arrays.sort(array);
        System.out.println("The "+ k +"th smallest element of the array is " + array[k-1]);

    }
}
