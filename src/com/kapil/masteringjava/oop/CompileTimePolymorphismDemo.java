package com.kapil.masteringjava.oop;

/**
 * Program to demonstrate Compile-Time Polymorphism in Java.
 * Demonstrates compile-time polymorphism using method overloading.
 *
 * @author Kapil Garg
 */
public class CompileTimePolymorphismDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Compile Time Polymorphism Demo ***");

        Addition addition = new Addition();

        addition.add(15, 27);
        addition.add(28.2, 1.12);
        addition.add("Ted", "Mosby");

        addition.add(13, 12);
        addition.add(6.27, 1.15);
        addition.add("Marshall", "Eriksen");

    }

}

class Addition {

    void add(int x, int y) {
        System.out.println("\nAddition of Integer Values :: " + (x + y));
    }

    void add(double x, double y) {
        System.out.println("Addition of Double Values :: " + (x + y));
    }

    void add(String x, String y) {
        System.out.println("Addition of String Values :: " + x + " " + y);
    }

}
