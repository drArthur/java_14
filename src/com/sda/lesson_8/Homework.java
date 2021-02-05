package com.sda.lesson_8;

import java.util.Random;
import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[23];
        Scanner input = new Scanner(System.in);
        String run = "";

        arr[0] = r.nextInt(10) + 2;
        arr[1] = r.nextInt(10) + 2;
        int counter = 2;

        do {
            //Printing out the array of cards
            System.out.print("Your cards: ");
            printArray(arr);
            //Prints the sum of all card values
            System.out.print("The sum: ");
            System.out.println(arraySum(arr));

            //Do we continue playing?
            System.out.println("Hit or stop?");
            run = input.nextLine().toLowerCase();

            //Break if we write "stop"
            if (run.equals("stop"))
                break;

            //Otherwise, draw a new card, set the counter to + 1
            arr[counter] = r.nextInt(10)+2;
            System.out.println("Your card: " + arr[counter]);
            counter++;

            //Check if we need to end the game.
            //Automatically converts 11 to 1 if needed.
            if (endGame(arr))
                break;

        } while (true);

        System.out.print("Your cards: ");
        printArray(arr);

        if(arraySum(arr) > 21)
            System.out.println("Busted!");

        System.out.println("Your score: " + arraySum(arr));
    }

    /**
     * Prints an int array in a form { 1, 2, 3, 4, ....}
     * @param arr The array to print.
     */
    public static void printArray(int[] arr) {
        System.out.print("{ " + arr[0]);
        for (int i = 1; i < arr.length && arr[i] != 0; i++)
            System.out.print(", " + arr[i]);
        System.out.println(" }");
    }

    /**
     * Counts the sum of elements in an int array.
     * @param arr Array sum of which gets calculated.
     * @return Sum of all elements.
     */
    public static int arraySum(int[] arr) {
        int sum = 0;
        for (int i : arr)
            sum += i;
        return sum;
    }

    /**
     * Check if the sum of all elements is bigger than 21.
     * If bigger - check if we got any aces.
     * If we got an ace - turn it into "1".
     * @param arr Array of cards
     * @return True if we end the game.
     */
    public static boolean endGame(int[] arr) {

        while (arraySum(arr) > 21) {
            if(containsAce(arr))
                changeAce(arr);
            else
                break;
        }

        if(arraySum(arr) >= 21)
            return true;
        return false;
    }

    /**
     * Finds, if we got 11 in an array
     * @param arr Array of cards
     * @return True, if contains 11. False otherwise.
     */
    public static boolean containsAce(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == 11)
                return true;
        return false;
    }

    /**
     * Changes the first 11 in the array to 1.
     * @param arr Array of cards.
     */
    public static void changeAce(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == 11) {
                arr[i] = 1;
                return;
            }

    }
}
