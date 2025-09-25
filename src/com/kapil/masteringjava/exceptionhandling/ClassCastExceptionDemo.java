package com.kapil.masteringjava.exceptionhandling;

/**
 * Program to demonstrate ClassCastException in Java.
 * Demonstrates how to handle ClassCastException using try-catch block.
 *
 * @author Kapil Garg
 */
@SuppressWarnings("All")
public class ClassCastExceptionDemo {

    public static void main(String[] args) {
        System.out.println("\n*** ClassCastException Demo ***\n");
        X obj1 = new X();
        try {
            Y obj2 = (Y) obj1;
        } catch (ClassCastException e) {
            System.out.println("Exception occurred in ClassCastExceptionDemo :: " + e.getMessage());
        }
        System.out.println("Program continues in normal flow...");
    }

}

class X {

}

class Y extends X {

}
