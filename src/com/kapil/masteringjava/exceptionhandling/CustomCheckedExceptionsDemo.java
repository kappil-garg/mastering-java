package com.kapil.masteringjava.exceptionhandling;

/**
 * Program to demonstrate Custom Checked Exceptions in Java.
 * Demonstrates how to create and use custom checked exceptions in Java.
 *
 * @author Kapil Garg
 */
public class CustomCheckedExceptionsDemo {

    public static void main(String[] args) {
        System.out.println("\n*** Custom Checked Exceptions Demo ***\n");
        try {
            throw new MyCheckedException("Test MyCheckedException");
        } catch (MyCheckedException e) {
            System.out.println("Exception Caught :: " + e.getClass().getName());
            System.out.println("Exception Message :: " + e.getMessage());
        }
    }

}

class MyCheckedException extends Exception {

    public MyCheckedException(String message) {
        super(message);
    }

}
