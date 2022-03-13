package com.binay.demo.prog;
public class MyClass {
    public static void main(String args[]) {
        int[] x = new int[5];
        x[1] = 5;
        x[0] = 1;
        x[4] = 2;
        
        for(int i = 0; i<x.length; i++)
            if(x[i] > 0)
                System.out.println("x [" + i + "] = " + x[i]);
            else {
                 x[i] = 100;
                System.out.println("x [" + i + "] = " + x[i]);
            }
        
        System.out.println("Done");
        
    }
}