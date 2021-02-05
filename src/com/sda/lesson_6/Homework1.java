package com.sda.lesson_6;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input your desired loan amount");
        double loanAmount = input.nextDouble();
        System.out.println("Please input your desired installments number");
        int installNumb = input.nextInt();
        double intRate;

        //Checking if loan amount is outside of the range
        if (loanAmount < 100 || loanAmount > 10000)
            loanAmount = 5000;
        //Checking if installment amount is outside of the range
        if (installNumb < 6 || installNumb > 48)
            installNumb = 36;

        //Setting interest rate depending on the number of installments
        if (installNumb <= 12 )
            intRate = 0.025;
        else if (installNumb <= 24)
            intRate = 0.05;
        else
            intRate = 0.1;

        //Calculate and output the monthly installment
        System.out.println("Each month You pay " + monthlyInstall(installNumb, loanAmount, intRate));

    }

    /**
     * Calculates the monthly installment of a loan.
     * @param installNumb Number of installments.
     * @param loanAmount Amount of the loan.
     * @param intRate Interest rate.
     * @return The monthly installment.
     */
    public static double monthlyInstall(int installNumb, double loanAmount, double intRate) {
        return (loanAmount + loanAmount * intRate) / installNumb;
    }

}
