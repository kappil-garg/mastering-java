package com.kapil.masteringjava.exceptionhandling;

/**
 * Program to demonstrate Exceptions in Java.
 * Demonstrates basic exception scenario using try-catch block.
 *
 * @author Kapil Garg
 */
@SuppressWarnings("All")
public class ExceptionDemo {

    public static void main(String[] args) {
        System.out.println("\n*** Exception Demo ***\n");
        try {
            System.out.println(50 / 0);
            System.out.println("Hello, Java");
        } catch (ArithmeticException e) {
            System.out.println("Exception occurred in ExceptionDemo :: " + e.getMessage());
        }
        System.out.println("Goodbye!");
    }

}
