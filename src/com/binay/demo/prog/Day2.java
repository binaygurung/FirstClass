package com.binay.demo.prog;

public class Day2 {

    public static void main(String[] args) {

//        switchExample();

        forExample();


    }

    private static void forExample() {

        // 1, 2, 3, 4...10
        // intialization of variable   2. condition  3. increment/decrement
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("--------------------------------");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

    }

    private static void switchExample() {
        // CREATED, INPROGRESS, COMPLETED, TERMINATED, ERROR
        // ADMIN, DEVELOPER, MANAGER, SALES

        //String role = "MANaGER";
        String role = "BCD";

        role = role.toUpperCase();

        switch (role)
        {
            case "ADMIN":
                System.out.println(role);
                break;

            case "DEVELOPER":
                System.out.println(role);
                break;

            case "MANAGER":
                System.out.println(role);
                System.out.println("I'm still executing");
                printMore();
                break;

            case "SALES":
                System.out.println(role);
                break;

            default:
                System.out.println("No role");
        }
    }


    private static void printMore() {
        System.out.println("I'm still executing from print");
    }



}