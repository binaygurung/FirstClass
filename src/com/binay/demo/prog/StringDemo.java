package com.binay.demo.prog;

public class StringDemo {

    public static void main(String[] args) {

        // String literal - stores in string constant pool
        String name = "Binay";
        name = name + " Gurung";
        System.out.println(name);


        // Char array
        char[] nameChars = {'b', 'i', 'n', 'a', 'y'};
        // new - stores object in heap
        String nameHeap = new String(nameChars);
        nameHeap = nameHeap.concat(" gurung");
        System.out.println(nameHeap);


        System.out.println(name.length());      // 12
        System.out.println(nameHeap.length());  // 12

        System.out.println(name.indexOf('G'));          // 6
        System.out.println(name.lastIndexOf('g'));  // 11


        // print all chars from string sequentially
        for (int i = 0; i < name.length(); i++) {
            System.out.println("char: " + name.charAt(i));  // charAt(index) -> returns char of that position
        }

        String str1 = "binay gurung";
        String str2 = "Binay";

        System.out.println(str1.compareTo(str2)); // 32 : left.compare(right) - left string is smaller than right
        System.out.println(str2.compareTo(str1));   // -32 : right.compare(left) - right string is larger than left
        System.out.println(str1.compareToIgnoreCase(str2)); // 0 - left & right are same


        String s1 = new String("binay");
        String s2 = new String("binay");

        System.out.println(s1 == s2);   // checks reference/memory location
        System.out.println(s1.equals(s2));  // checks only content


        String s3 = "binay";
        String s4 = "binay";

        System.out.println(s3 == s4);   // checks reference/memory location
        System.out.println(s3.equals(s4));  // checks only content


    }
}