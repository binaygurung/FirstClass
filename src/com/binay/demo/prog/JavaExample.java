package com.binay.demo.prog;

import java.util.ArrayList;

class JavaExample {
    public static void main(String args[]) {
        ArrayList<String> alist = new ArrayList<String>();
        alist.add("Steve");
        alist.add("Tim");
        alist.add("Lucy");
        alist.add("Pat");
        alist.add("Angela");
        alist.add("Tom");


        //displaying elements
        System.out.println(alist);

        //Adding "Rahul", "Binay" & "Pushpa" on 0 elements
        alist.add("Rahul");
        alist.add("Binay");
        alist.add(0, "Pushpa");

        //displaying elements
        System.out.println(alist);

        //removing "Steve"
        alist.remove("Steve");
        System.out.println(alist);

        //removing 2nd elements
        alist.remove(2);
        System.out.println(alist);
    }
}