package com.binay.demo.prog.collection.list;

import java.util.*;
import java.util.function.Predicate;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Rahul");
        names.add("Binay");
        names.add("Binay");
        names.add("Binay");

        names.iterator();

        ListIterator<String> itr = names.listIterator();
        while(itr.hasNext()){
            String name = itr.next();
            System.out.println("** : " + name);
        }

        for (String n : names) {
            System.out.println("## : " + n);
        }

        List nonGenericList = (List) names. clone();

        names.add(1, "Batman");
        System.out.println(names.get(0));
        System.out.println(names.get(2));
        System.out.println(names.get(1));
        List<String> listName = new ArrayList<>(names);
        System.out.println("List Names :" + listName);
        System.out.println("Index of Binay : " + listName.indexOf("Binay"));
        System.out.println("Last Index of Binay : " + listName.lastIndexOf("Binay"));
        System.out.println("Removed Name from List : " + listName.remove(listName.lastIndexOf("Binay")));
        Predicate<String> binayNamePredicate = name -> name.equals("Binay");
        listName.removeIf(binayNamePredicate);
        System.out.println("Size Of The List : " + names.size());
        System.out.println("Is The List is Empty? : " + names.isEmpty());
        System.out.println("List Contains With Only Small Letters :" + names.contains("binay"));
        System.out.println("List Contains With Capital & Small Letters :" + names.contains("Binay"));
        System.out.println("Remove Just One Binay From The List :" + names.remove("Binay"));
        System.out.println("After Removing Binay Size Of The List Is :" + names.size());
        System.out.println("Remove All Binay From The List :" + names.removeAll(Arrays.asList("Binay", "", "")));
        System.out.println("Size Of The List After Removing Binay Is Now :" +names.size());
        names.clear();
        System.out.println("Is The List Is Empty ? : " + names.isEmpty());


        nonGenericList.add(2);
        nonGenericList.add('c');
        nonGenericList.add(new ArrayList<>());
        System.out.println("Non generic list: " + nonGenericList);
    }
}
