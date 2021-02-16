package com.sda.lesson_12;

import java.util.Arrays;

//Given an array A[] consisting 0s, 1s and 2s.
// The task is to write a function that sorts the given array.
// The functions should put all 0s first, then all 1s and all 2s in last.
public class Homework_3 {
    public static void main(String[] args) {
        int[] array = {1,0,1,2,1,0,0,2,1,0,1,0};
        int[] vals = new int[3];
        int counter = 0;

        for (int i : array)
            vals[i]++;

        for(int i = 0; i < vals.length; i++)
            while(vals[i] > 0) {
                array[counter] = i;
                vals[i]--;
                counter++;
            }

        System.out.println(Arrays.toString(array));
    }
}
