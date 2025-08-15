package com.kapil.masteringjava.basics.controlflow;

/**
 * Program to demonstrate return statements in Java.
 * Demonstrates how to use return statements to exit methods and return values.
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

    /**
     * Method that returns an integer value.
     *
     * @return an integer value
     */
    private static int returnWithValue() {
        System.out.println("Inside returnWithValue() method.");
        return 46;
    }

    /**
     * Method that demonstrates returning from a void method.
     * It exits the method early based on a condition.
     */
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
