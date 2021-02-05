package com.sda.lesson_9;

public class Example2 {
    public static void main(String[] args) {
        int[][] array = new int[][]{
                {0,1,2,3,4,5,6,7,8,9},
                {10,11,12,13,14,15,16,17,18,19},
                {20,21,22,23,24,25,26,27,28,29}
        };

        System.out.println("for loops");
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array[i].length; j++)
                System.out.print(" " + array[i][j]);
            System.out.println();
        }

        System.out.println("foreach loops");
        for(int[] i : array) {
            for(int j : i) {
                System.out.print(" " + j);
            }
            System.out.println();
        }


    }
}
