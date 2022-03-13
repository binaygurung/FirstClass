package com.binay.demo.prog;

public class FirstClassIfStatements {

    public static void main(String[] args) {

        String yourName = "binay";
        String myName = "rahul";

        checkNameIf(yourName);
        checkNameIf(myName);
        System.out.println("-------");

        checkNumberIfElse(50);
        checkNumberIfElse(10);
        checkNumberIfElse(9);
        System.out.println("------");


        checkTimeIfElseIf(10);
        checkTimeIfElseIf(13);
        checkTimeIfElseIf(2);
        checkTimeIfElseIf(12);
        System.out.println("------");

        checkNumberNestedIfElse(50);
        checkNumberNestedIfElse(100);
        System.out.println("------");

    }

    static void checkNameIf(String name) {

        if (name.equalsIgnoreCase("Binay")) {
            System.out.println("I'm learning");
        }

        if (name.equalsIgnoreCase("Rahul")) {
            System.out.println("I'm teachings");
        }
    }

    static void checkNumberIfElse(int num) {

        if (num >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Teen/child");
        }
    }

    static void checkNumberNestedIfElse(int num) {

        if (num >= 18) {
            if (num < 100) {
                System.out.println("Adult");
            } else {
                System.out.println("Dead");
            }
        } else {
            System.out.println("Child");
        }

//        if (num >= 18 && num < 100) {
//            System.out.println("Adult");
//        } else {
//            System.out.println("Dead");
//        }
    }

    private static void checkTimeIfElseIf(int time) {

        if (time > 6 && time <= 12) {
            System.out.println("Good morning");
        } else if (time > 12 && time <= 18) {
            System.out.println("Good Afternoon");
        } else if (time > 18 && time <= 24) {
            System.out.println("Good Evening");
        } else {
            System.out.println("Good night");
        }

    }

}



