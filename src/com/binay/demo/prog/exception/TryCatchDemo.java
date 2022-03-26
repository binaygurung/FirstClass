package com.binay.demo.prog.exception;

import java.util.Scanner;

public class TryCatchDemo {
    public static void main(String[] args) {

        String threadName = Thread.currentThread().getName();       // print thread name

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");

        int num = 0;
        try {
            // opened connection with DB

            String no = scanner.next();  // you fetched no from DB
            num = Integer.parseInt(no);  // Parsed no with your own logic
            System.out.println("Number parsed");

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (num == 0)
                num = 5;
            // close connection here... IMP
        }

        float devidation = 100 / num;
        System.out.println("Devidation: " + devidation);

        System.out.println("After all exceptions");


    }
}