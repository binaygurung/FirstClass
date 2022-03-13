package com.binay.demo.prog;

public class CommandLineArgs {

    public static void main(String[] args) {

        if(args.length > 1) {
            int row = Integer.parseInt(args[0]);
            int column = Integer.parseInt(args[1]);

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    System.out.println(i + " " + j);
                }
            }
        } else {
            System.out.println("Rows and columns not specified");
        }
    }
}
