package com.binay.demo.prog;

public class AbstractDemo {
    public static void main(String[] args) {
//        Bird animal = new Dog();
//        animal.sound();
//
//        animal = new Cat();
//        animal.sound();

        printSound(new Dog());
        printSound(new Cat());
    }

    static void printSound(AnimalNew animal) {
        animal.sound();
        animal.isAlive();
    }
}


abstract class AnimalNew {
    public abstract void sound();

    public void isAlive(){
        System.out.println("Alive");
    }
}


abstract class Bird extends AnimalNew {
}

class Dog extends Bird {

    @Override
    public void sound() {
        System.out.println("BARK");
    }

}


class Cat extends Bird {

    @Override
    public void sound() {
        System.out.println("MEOW");
    }

}