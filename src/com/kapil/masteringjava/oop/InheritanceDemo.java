package com.kapil.masteringjava.oop;

/**
 * Program to demonstrate Inheritance in Java.
 * Demonstrates how a subclass (Child) inherits fields and methods from its superclass (Parent).
 *
 * @author Kapil Garg
 */
public class InheritanceDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Inheritance Demo ***\n");

        Parent parent = new Parent();
        System.out.println("x = " + parent.x);
        parent.displayParentMessage();

        Child child = new Child();
        System.out.println("y = " + child.y);
        child.displayChildMessage();
        System.out.println("x = " + child.x);
        child.displayParentMessage();

    }

}

class Parent {

    int x;

    Parent() {
        this.x = 100;
    }

    void displayParentMessage() {
        System.out.println("Hello from Class :: Parent");
    }

}

class Child extends Parent {

    int y = 15;

    void displayChildMessage() {
        System.out.println("Hello from Class :: Child");
    }

}
