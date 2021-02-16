package com.sda.lesson_11;

import java.math.BigInteger;

public class Example1 {
    public static void main(String[] args) {
        BigInteger i = new BigInteger("1");  //or use BigInteger.ONE
        int n = 100;
        System.out.println(i);
        i = i.add(BigInteger.valueOf(n));
        System.out.println(i);
        i = i.subtract(BigInteger.valueOf(n));
        System.out.println(i);
        i = i.multiply(BigInteger.valueOf(n));
        System.out.println(i);
        i = i.divide(BigInteger.valueOf(n));
        System.out.println(i);

        int[] arr = new int[5];

    }
}
