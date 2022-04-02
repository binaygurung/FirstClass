package com.binay.demo.prog.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> superHeros = new LinkedList<>();
        superHeros.add("Bat-Man");
        superHeros.add("Super-Man");
        superHeros.add("Iron-Man");
        superHeros.add("Spider-Man");
        superHeros.addFirst("Robin");
        superHeros.addLast("Joker");

        // use similar + advance methods for linkedlist
        ListIterator<String> itr = superHeros.listIterator();
        while(itr.hasNext()){
            String name = itr.next();
            System.out.println("$ $ : " + name);
        }
        //List nonGenericList = (List) superHeros. clone();
        superHeros.add(4,"Rahul");
        superHeros.add(7,"Binay");

       // List<String> names = new ArrayList<>();
        System.out.println("List Names :" + superHeros);
        System.out.println("Size Of The List : " + superHeros.size());
        System.out.println("Is The List is Empty? : " + superHeros.isEmpty());
        System.out.println("List Contains With Capital & Small Letters :" + superHeros.contains("Binay"));
        System.out.println("Remove Just One Binay From The List :" + superHeros.remove("Binay"));
        System.out.println("After Removing Binay Size Of The List Is :" + superHeros.size());

        // listiterator() in forward & backward direction

        ListIterator<String> lItr = superHeros.listIterator();
        System.out.println("Traversing elements in forward direction");
        while(lItr.hasNext()){

            System.out.println("index:"+lItr.nextIndex()+" value:"+lItr.next());
        }
        System.out.println("Traversing elements in backward direction");
        while(lItr.hasPrevious()){

            System.out.println("index:"+lItr.previousIndex()+" value:"+lItr.previous());
        }

    }
}
