package com.sda.lesson_9;

public class Example1 {
    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,4,5,6,7,8,9,10};

        System.out.println("for loop");
        for(int i = 0; i  < array.length; i++)
            System.out.print(" " + array[i]);
        System.out.println();

        System.out.println("foreach loop");
        for(int i : array)
            System.out.print(" " + i);
        System.out.println();

        System.out.println("while loop");
        int counter = 0;
        while(counter < array.length) {
            System.out.print(" " + array[counter]);
            counter++;
        }
        System.out.println();
    }
}
