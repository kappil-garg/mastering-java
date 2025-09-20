package com.kapil.masteringjava.oop;

/**
 * Program to demonstrate Static Nested Class in Java.
 * Demonstrates how a static nested class can access static members of its outer class.
 *
 * @author Kapil Garg
 */
public class StaticNestedClassDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Static Nested Class Demo ***\n");

        DemoOuterClass demoOuterClass = new DemoOuterClass();
        demoOuterClass.displayOuterDetails();

        DemoOuterClass.StaticNestedClass staticNestedClass = new DemoOuterClass.StaticNestedClass();
        staticNestedClass.displayStaticNestedDetails();

    }

}

class DemoOuterClass {

    int a = 10;
    static int b = 20;

    void displayOuterDetails() {
        System.out.println("Inside DemoOuterClass :: displayOuterDetails()");
        System.out.println("a :: " + a + "\t||\tb :: " + b);
        StaticNestedClass obj = new StaticNestedClass();
        System.out.println("c :: " + obj.c);
    }

    static class StaticNestedClass {

        int c = 30;

        void displayStaticNestedDetails() {
            System.out.println("\nInside StaticNestedClass :: displayStaticNestedDetails()");
            System.out.println("b :: " + b + "\t||\tc :: " + c);
        }

    }

}
