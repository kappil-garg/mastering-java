package com.kapil.masteringjava.oop;

/**
 * Program to demonstrate Multi-Level Inheritance in Java.
 * Demonstrates how the Dog class inherits from Mammal which in turn inherits from Animal.
 *
 * @author Kapil Garg
 */
public class MultiLevelInheritanceDemo {

    public static void main(String[] args) {
        System.out.println("\n*** Multi-Level Inheritance Demo ***\n");
        Dog dog = new Dog();
        dog.makeSound();
        dog.walk();
        dog.breedInfo();
    }

}

class Animal {

    protected void makeSound() {
        System.out.println("Animal makes a sound.");
    }

}

class Mammal extends Animal {

    protected void walk() {
        System.out.println("Mammal walks on land.");
    }

}

class Dog extends Mammal {

    protected void breedInfo() {
        System.out.println("Dog is a Labrador.");
    }

}
