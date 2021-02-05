package com.sda.lesson_6;

public class Example2 {
    public static void main(String[] args) {
        String[] array = {"Alice", "has", "a", "cat"};

        for (String element: array) {
            System.out.println(element + " ");
        }
        System.out.println();

        int[] array1 = {1,2,3,54,7,8,89,34,3,546,4};
        for(int i : array1) {
            i = 4;
        }

        for(int i : array1) {
            System.out.println(i);
        }
    }
}
