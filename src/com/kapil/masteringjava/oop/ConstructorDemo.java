package com.kapil.masteringjava.oop;

/**
 * Program to demonstrate Constructors in Java.
 * Demonstrates the use of default and parameterized constructors to initialize object fields.
 *
 * @author Kapil Garg
 */
public class ConstructorDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Default Constructor Demo ***\n");
        Person firstPerson = new Person();
        firstPerson.show();

        System.out.println("\n*** Parameterized Constructor Demo ***\n");
        Person secondPerson = new Person(29, "Ted Mosby");
        secondPerson.show();

    }

}

class Person {

    private final String name;
    private int age;

    Person() {
        this.name = "Unknown";
    }

    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void show() {
        System.out.println("Name :: " + name + " || Age :: " + age);
    }

}
