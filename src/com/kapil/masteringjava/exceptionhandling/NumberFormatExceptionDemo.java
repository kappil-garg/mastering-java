package com.kapil.masteringjava.exceptionhandling;

/**
 * Program to demonstrate NumberFormatException in Java.
 * Demonstrates how to handle NumberFormatException using try-catch block.
 *
 * @author Kapil Garg
 */
@SuppressWarnings("All")
public class NumberFormatExceptionDemo {

    public static void main(String[] args) {
        System.out.println("\n*** NumberFormatException Demo ***\n");
        String s = "129";
        int a = Integer.parseInt(s);
        System.out.println("Parsed value = " + a);
        s = "Java";
        try {
            a = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("Exception occurred in NumberFormatExceptionDemo :: " + e.getMessage());
        }
        System.out.println("Goodbye :: " + a);
    }

}
