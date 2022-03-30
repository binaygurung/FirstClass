package com.binay.demo.prog.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Rahul");
        names.add("Binay");
        names.add("Binay");
        names.add("Binay");

        Iterator itr = names.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("Size Of The List : " + names.size());
        System.out.println("Is The List is Empty? : " + names.isEmpty());
        System.out.println("List Contains With Only Small Letters :" + names.contains("binay"));
        System.out.println("List Contains With Capital & Small Letters :" + names.contains("Binay"));
        System.out.println("Remove Just One Binay From The List :" + names.remove("Binay"));
        System.out.println("After Removing Binay Size Of The List Is :" + names.size());
        System.out.println("Remove All Binay From The List :" + names.removeAll(Arrays.asList("Binay")));
        System.out.println("Size Of The List After Removing Binay Is Now :" +names.size());
        names.clear();
        System.out.println("Is The List Is Empty ? : " + names.isEmpty());
    }
}
