package com.binay.demo.prog;

import java.util.Arrays;
import java.util.List;

public class Day3 {

    public static void main(String[] args) {
        forLoopOnListArray();
        whileLoop();
    }

    private static void whileLoop() {

        int count = 0;
        boolean cond = true;

        while(cond) {
            System.out.println(count++);
            if (count > 1000) {
                cond = false;
                //break;
            }
            System.out.println("****");
        }
    }

    private static void forLoopOnListArray() {
        //                names[0]      names[1]    names[2]    names[3] ...names[99]
        String[] names = {"binay",     "rahul",     "amit",     "ganesh"};

        for (int i = 0; i < names.length; i++) {
            System.out.println("Name: " + names[i]);
        }

        System.out.println();
//        List<String> namesList = new ArrayList<>();
        List<String> namesList = Arrays.asList("binay", "rahul", "amit", "ganesh"); // size 4


        for (int i = 0; i < namesList.size(); i++) {
            String name = namesList.get(i);
            System.out.println(name.toUpperCase());
        }

        System.out.println("\n---------- Revered list --------------");
        for (int i = namesList.size() - 1; i >= 0; i--) {
            String name = namesList.get(i);
            System.out.println(name.toLowerCase());
        }



        System.out.println("\n------------ Enhanced for loop ------------");
        for (String name: namesList) {  // below 2 lined are combined in enhanced for loop
//            for (int i = 0; i < namesList.size(); i++) {
//                String name = namesList.get(i);
            System.out.println("---> " + name);
        }

    }
}