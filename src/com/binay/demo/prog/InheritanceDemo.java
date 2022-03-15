package com.binay.demo.prog;

public class InheritanceDemo {

    public static void main(String[] args) {

        Child child = new Child();
        child.print();


    }
}


class GrandParent {
    public String name = "XYZ";

    public void print() {
        System.out.println("name from grand parent: " + this.name);
    }
}

class Parent extends GrandParent {
    public String name = "Binay";

    public void print() {
        super.print();
        System.out.println("name from parent: " + this.name);
    }
}

class Child extends Parent {
    String name = "abc";

    public void print() {
        super.print();
        System.out.println("name from child: " + name);
    }
}


//class Child1 extends Parent, GrandParent {        // java doesn't support multiple inheritance
//}