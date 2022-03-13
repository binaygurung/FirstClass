package com.binay.demo.prog;

public class CommonExamples {

    public static void main(String[] args) {

        Lion lion = new Lion();
        lion.print();

//        printAnimalSound(lion);
//        printAnimalSound(new Animal());

    }

    static void printAnimalSound(Animal animal) {
        animal.animalSound();
    }

}

class Animal {
    String name = "Animal";
    public void animalSound() {
        System.out.println("Animal sound");
    }
}

class Lion extends Animal {
    @Override
    public void animalSound() {
        System.out.println("Roar");
        super.animalSound();
    }

    public void print() {
        animalSound();
    }
}