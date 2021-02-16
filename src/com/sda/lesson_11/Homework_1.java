package com.sda.lesson_11;

//Given 2 arrays arr1 and arr2, find whether arr2 is a subset of arr1.
//For example, arr2 {12, 44} is a subset of arr1 {2,3,4,5,12,44}

public class Homework_1 {
    public static void main(String[] args) {
        //setting up the arrays
        int[] arr1 = {2,3,4,5,12,44};
        int[] arr2 = {12, 44};
        //boolean value that shows whether arr2 is a subset
        boolean isSubset = true;

        //going from 0th element up to the last viable element in arr1
        //in this case: from 2 to 12(included)
        for (int i = 0; i <= arr1.length - arr2.length; i++) {
            //assuming that is a subset unless proven wrong
            //(for each iteration)
            isSubset = true;
            //going through each arr2 element and
            // comparing with the according arr1 elements
            for (int j = 0; j < arr2.length; j++) {
                //if an element is not equal -> not a subset
                if(arr2[j] != arr1[i+j]) {
                    isSubset = false;
                    break;
                }
            }
            //if after going through arr2 it's a subset,
            //write a success text, stop looping
            if(isSubset) {
                System.out.println("arr2 is a subset of arr1");
                break;
            }
        }

        //if after looping through everything, isSubset is still false,
        //write a negative response
        if(!isSubset)
            System.out.println("arr2 is NOT a subset of arr1");
    }

}
