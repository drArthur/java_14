package com.sda.lesson_12;

import java.util.Arrays;

public class Example1_Sort {
    static int[] arr = {40,10,-30,45};

    public static void main(String[] args) {

        int[] array = {11,5,6,2,6,4,8,10};
        System.out.println(Arrays.toString(bubbleSort(array)));

        array = new int[] {11,5,6,2,6,4,8,10};

        System.out.println(Arrays.toString(insertionSort(array)));

        array = new int[] {11,5,6,2,6,4,8,10};
        System.out.println(Arrays.toString(selectionSort(array)));

        mergeSort(0,arr.length-1);
        System.out.println(Arrays.toString(arr));

        array = new int[] {11,5,6,2,6,4,8,10};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static int[] bubbleSort(int[] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length - 1 - i; j++) {
                if (table[j] > table[j + 1]) {
                    int temp = table[j];
                    table[j] = table[j + 1];
                    table[j + 1] = temp;
                }
            }
        }
        return table;
    }

    public static int[] insertionSort(int[] tab) {
        for (int i = 1; i < tab.length; i++) {
            int valueToSort = tab[i];
            int j;
            // In case of smaller value than valueToSort then iteration should stop.
            for (j = i; j > 0 && tab[j - 1] > valueToSort; j--) {
                tab[j] = tab[j - 1];
            }
            tab[j] = valueToSort;
        }
        return tab;
    }

    public static int[] selectionSort(int[] table) {
        for (int i = 0; i < table.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < table.length; j++) {
                if (table[j] < table[index])
                    index = j;
            }

            int smallerNumber = table[index];
            table[index] = table[i];
            table[i] = smallerNumber;
        }
        return table;
    }


    // Recursive algorithm for merge sort
    public static void mergeSort(int start, int end) {
        int mid = (start + end) / 2;
        if (start < end) {
            // Sort left half
            mergeSort(start, mid);
            // Sort right half
            mergeSort(mid + 1, end);
            // Merge left and right half
            merge(start, mid, end);
        }
    }


    private static void merge(int start, int mid, int end) {
        // Initializing temp array and index
        int[] tmpArray = new int[arr.length];
        int tmpArrayIndex = start;

        int startIndex = start;
        int midIndex = mid + 1;

        // Iterate until smaller list reaches to the end
        while (startIndex <= mid && midIndex <= end) {
            if (arr[startIndex] < arr[midIndex]) {
                tmpArray[tmpArrayIndex++] = arr[startIndex++];
            } else {
                tmpArray[tmpArrayIndex++] = arr[midIndex++];
            }
        }

        // Copy remaining elements
        while (startIndex <= mid) {
            tmpArray[tmpArrayIndex++] = arr[startIndex++];
        }
        while (midIndex <= end) {
            tmpArray[tmpArrayIndex++] = arr[midIndex++];
        }

        // Copy tmpArray to actual array after sorting
        if (end + 1 - start >= 0)
            System.arraycopy(tmpArray, start, arr, start, end + 1 - start);
    }

}
