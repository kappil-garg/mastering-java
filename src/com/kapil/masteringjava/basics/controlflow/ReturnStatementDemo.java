package com.kapil.masteringjava.basics.controlflow;

/**
 * Program to demonstrate how the return statement works for both value-returning methods and void methods in Java.
 *
 * @author Kapil Garg
 */
public class ReturnStatementDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Return With Value Demo ***\n");
        int result = returnWithValue();
        System.out.println("Returned value from returnWithValue() :: " + result);

        System.out.println("\n*** Return With Void Demo ***");
        returnWithVoid();
        System.out.println("\nBack in main after returnWithVoid().");

    }

    private static int returnWithValue() {
        System.out.println("Inside returnWithValue() method.");
        return 46;
    }

    private static void returnWithVoid() {
        for (int i = 1; i < 5; i++) {
            System.out.println("\nLoop iteration :: #" + i);
            if (i == 3) {
                System.out.println("Method returnWithVoid() is about to exit (return statement triggered).");
                return;
            }
            System.out.println("Continuing execution for iteration :: #" + i);
        }
    }

}
