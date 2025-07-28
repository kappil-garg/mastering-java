package com.kapil.masteringjava.oop;

/**
 * Program to demonstrate Covariant Return Type in Java.
 * Demonstrates how a subclass can override a method to return a more specific type than defined in the superclass.
 *
 * @author Kapil Garg
 */
public class CovariantReturnTypeDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Covariant Return Type Demo ***\n");
        CovariantDemoSub covariantDemo = new CovariantDemoSub();

        System.out.println("Calling messageSub() on CovariantDemoSub object");
        covariantDemo.messageSub();

        System.out.println("\nCalling covariantDemo() and then messageSub() on CovariantDemoSub object");
        covariantDemo.covariantDemo().messageSub();

        System.out.println("\nCalling covariantDemo() and then messageSuper() on CovariantDemoSub object");
        covariantDemo.covariantDemo().messageSuper();

        System.out.println("\nCalling messageSuper() on CovariantDemoSuper object");
        new CovariantDemoSuper().messageSuper();

        System.out.println("\nCalling covariantDemo() and then messageSuper() on CovariantDemoSuper object");
        new CovariantDemoSuper().covariantDemo().messageSuper();

    }

}

class CovariantDemoSuper {

    CovariantDemoSuper covariantDemo() {
        return this;
    }

    void messageSuper() {
        System.out.println("Welcome to Covariant Return Type :: CovariantDemoSuper");
    }

}

class CovariantDemoSub extends CovariantDemoSuper {

    @Override
    CovariantDemoSub covariantDemo() {
        return this;
    }

    void messageSub() {
        System.out.println("Welcome to Covariant Return Type :: CovariantDemoSub");
    }

}
