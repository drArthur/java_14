package com.sda.lesson_5;

public class Example3 {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println("O(1) with " + array.length + " elements : "+ o1(array));
        System.out.println("O(N) with " + array.length + " elements : "+ oN(array));
        System.out.println("O(NlogN) with " + array.length + " elements : "+ oNlogN(array));
        System.out.println("O(N^2) with " + array.length + " elements : "+ oN2(array));
        System.out.println("O(N^3) with " + array.length + " elements : "+ oN3(array));

    }

    public static int o1(int[] arr) {
        //a constant amount of actions is taken
        int x = 5+10*29;
        //do as many things as we want
        x += arr[0];

        //returning the number of steps taken(roughly)
        return 1;
    }

    public static int oN(int[] arr) {
        //the amount of steps taken
        int counter = 0;

        for(int i = 0; i < arr.length; i++) {
            //we do something here
            counter++;
        }
        return counter;
    }

    public static int oNlogN(int[] arr) {
        int counter = 0;

        for(int i = 0; i < arr.length; i++) {
            //we do something here
            for(int j = i; j < arr.length; j++) {
                counter++;
            }
        }
        return counter;
    }

    public static int oN2(int[] arr) {
        int counter = 0;

        for(int i = 0; i < arr.length; i++) {
            //we do something here
            for(int j = 0; j < arr.length; j++) {
                counter++;
            }
        }
        return counter;
    }

    public static int oN3(int[] arr) {
        int counter = 0;

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                for(int k = 0; k < arr.length; k++) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
