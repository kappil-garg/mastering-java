package com.kapil.masteringjava.exceptionhandling;

/**
 * Program to demonstrate 'finally' block in Java.
 * Demonstrates the use of the 'finally' block in exception handling.
 *
 * @author Kapil Garg
 */
@SuppressWarnings("All")
public class FinallyBlockDemo {

    public static void main(String[] args) {
        System.out.println("\n*** Finally Block Demo ***\n");
        try {
            System.out.println(50/0);
        } catch (ArithmeticException e) {
            System.out.println("Exception occurred :: " + e);
        } finally {
            System.out.println("This is the finally block. It always executes.");
        }
        System.out.println("Program execution continues after try-catch-finally.");
    }

}
