package com.binay.demo.prog;

public class DecreasingTrianglePattern {

    public static void main(String[] args){
        int n = 6;

        for (int i = 0; i <=n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
