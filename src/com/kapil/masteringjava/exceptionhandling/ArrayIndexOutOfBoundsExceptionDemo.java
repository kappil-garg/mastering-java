package com.kapil.masteringjava.exceptionhandling;

/**
 * Program to demonstrate ArrayIndexOutOfBoundsException in Java.
 * Demonstrates handling of ArrayIndexOutOfBoundsException using try-catch block.
 *
 * @author Kapil Garg
 */
public class ArrayIndexOutOfBoundsExceptionDemo {

    public static void main(String[] args) {
        System.out.println("\n*** ArrayIndexOutOfBoundsException Demo ***\n");
        int[] numbers = {15, 1, 7, 29};
        try {
            for (int i = 0; i < numbers.length; i++) {
                System.out.print("Index i = " + i + " | ");
                // ArrayIndexOutOfBoundsException at i = 3
                System.out.println("Value at (index + 1) = " + numbers[i + 1]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occurred in ArrayIndexOutOfBoundsExceptionDemo :: " + e.getMessage());
        }
        System.out.println("Goodbye!");
    }

}
