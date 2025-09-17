package com.kapil.masteringjava.oop;

/**
 * Program to demonstrate Method Hiding in Java.
 * Demonstrates method hiding using static methods.
 *
 * @author Kapil Garg
 */
@SuppressWarnings("All")
public class MethodHidingDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Method Hiding Demo ***\n");

        System.out.println("Calling static methods directly using class names\n");
        SubClass.classMethod();
        SuperClass.classMethod();

        System.out.println("\nCalling methods via SuperClass reference pointing to SubClass object.\n");
        SuperClass superClass = new SubClass();
        superClass.instanceMethod();
        superClass.classMethod();

        System.out.println("\nCalling methods via SubClass reference.\n");
        SubClass subClass = new SubClass();
        subClass.instanceMethod();
        subClass.classMethod();

    }

}

class SuperClass {

    public static void classMethod() {
        System.out.println("Hello from classMethod() :: SuperClass");
    }

    public void instanceMethod() {
        System.out.println("Hello from instanceMethod() :: SuperClass");
    }

}

class SubClass extends SuperClass {

    public static void classMethod() {
        System.out.println("Hello from classMethod() :: SubClass");
    }

    @Override
    public void instanceMethod() {
        System.out.println("Hello from instanceMethod() :: SubClass");
    }

}
