package com.binay.demo.prog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InterfaceDemo {
    static {
        List<Integer> numbers = null;
        System.out.println("from static block: " + numbers);
    }

    public static void main(String[] args) {
        List<Integer> numbers = null;
        System.out.println(numbers);
        numbers = new ArrayList<>();
        System.out.println(numbers);

        numbers.add(5);
        numbers.add(4);
        numbers.add(10);
        numbers.add(1);

        BubbleSort bubble = new BubbleSort();
        bubble.run();

        sort(bubble, numbers);
        Sorting insertion = new InsertionSort();
        sort(insertion, numbers);
    }

    static void sort(Sorting sorting, List<Integer> numbers) {
        sorting.sort(numbers);
    }
}


interface Sorting {
    public static final String SORT_ALGO = "BUBBLE";        // Constants
    String SORT_ALGO1 = "BUBBLE";       // Constants
    public static final Integer SORT_ALGO2 = 10;            // Constants

    public abstract List<Integer> sort(List<Integer> list);

    void print(List<Integer> list);

}

interface Printing {
    void print(List<Integer> list);
}


class BubbleSort implements Sorting, Printing {

    @Override
    public List<Integer> sort(List<Integer> list) {
        System.out.println("Before sorting: " + list);
        Collections.sort(list);
        System.out.println("After sorting: " + list);
        return list;
    }

    @Override
    public void print(List<Integer> list) {
    }

    // concrete method - it belongs to BubbleSort class only
    public void run() {
    }
}


class InsertionSort implements Sorting {

    @Override
    public List<Integer> sort(List<Integer> list) {
        System.out.println("Before sorting: " + list);
        Collections.sort(list);
        System.out.println("After sorting: " + list);
        return list;
    }

    @Override
    public void print(List<Integer> list) {

    }
}