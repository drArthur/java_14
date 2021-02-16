package com.sda.lesson_11;

// Write a function which takes an array and prints the majority element (if it exists),
// otherwise prints “No Majority Element”. A majority element in an array A[] of size n
// is an element that appears more than n/2 times (and hence there is at most one such
// element).

public class Homework_2 {
    public static void main(String[] args) {
        int[] array = {1,1,4,5,3,2,1,1,1,1,1};

        int element;
        int counter;
        boolean isMajority = false;
        for(int i = 0; i < array.length; i++) {
            element = array[i];
            counter = 0;
            for (int j = i; j < array.length; j++) {
                if(element == array[j])
                    counter++;
            }
            if(counter > array.length/2) {
                System.out.println("The majority element is " + element);
                isMajority = true;
                break;
            }
        }
        if(!isMajority)
            System.out.println("There is no majority element here!");
    }
}
