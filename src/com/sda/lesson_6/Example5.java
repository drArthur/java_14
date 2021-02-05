package com.sda.lesson_6;

//Returns
public class Example5 {
    public static void main(String[] args) {

        System.out.println();
        f1();
        System.out.println(f2());
        System.out.println(f3());
        System.out.println(5*5);
        System.out.println(sqr(5));

        System.out.println(checkTemperature(40));
        System.out.println(checkTemperature(30));
        System.out.println(checkTemperature(36.7f));
    }

    public static void f1() {
        System.out.println("F1");
        return;
        //System.out.println("F1 after return");
    }

    public static int f2() {
        System.out.println("F2");
        return 1;
        //System.out.println("F2 after return");
    }

    public static String f3() {
        System.out.println("F3");
        return "STRING";
        //System.out.println("F3 after return");
    }

    public static int sqr(int n) {
        return n*n;
    }

    public static String checkTemperature(float temperature) {
        if (temperature >= 37.0f) {
            return "You have a fever!";
        } else if (temperature >= 36.6f && temperature < 37.0f) {
            return "You are healthy!";
        } else {
            return "You are weakened!";
        }
    }

}
