package com.kapil.masteringjava.exceptionhandling;

/**
 * Program to demonstrate Custom Unchecked Exceptions in Java.
 * Demonstrates how to create and use custom unchecked exceptions in Java.
 *
 * @author Kapil Garg
 */
public class CustomUncheckedExceptionDemo {

    public static void main(String[] args) {
        System.out.println("\n*** Custom Unchecked Exception Demo ***\n");
        try {
            throw new MyUncheckedException("Test MyUncheckedException");
        } catch (MyUncheckedException e) {
            System.out.println("Exception Caught :: " + e.getClass().getName());
            System.out.println("Exception Message :: " + e.getMessage());
        }
    }

}

class MyUncheckedException extends RuntimeException {

    public MyUncheckedException(String message) {
        super(message);
    }

}
