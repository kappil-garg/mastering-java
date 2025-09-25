package com.kapil.masteringjava.exceptionhandling;

import java.io.IOException;

/**
 * Program to demonstrate 'throw' and 'throws' in Java.
 * Demonstrates how to use 'throw' to explicitly throw an exception and 'throws' to declare exceptions.
 *
 * @author Kapil Garg
 */
public class ThrowAndThrowsDemo {

    public static void main(String[] args) {
        System.out.println("\n*** Throw and Throws Demo ***\n");
        ThrowAndThrowsDemo obj = new ThrowAndThrowsDemo();
        obj.handleException();
        System.out.println("Program continues in normal flow...");
    }

    /**
     * Method handleException() calls method callThrowingMethod() and handles any exception thrown by it
     */
    void handleException() {
        System.out.println("Inside method handleException()");
        try {
            callThrowingMethod();
        } catch(Exception e) {
            System.out.println("Exception handled in method handleException() :: " + e);
        }
    }

    /**
     * Method callThrowingMethod() calls method throwException()
     * Declares that it throws IOException
     */
    void callThrowingMethod() throws IOException {
        System.out.println("Inside method callThrowingMethod()");
        throwException();
    }

    /**
     * Method throwException() throws IOException (checked exception)
     * Declares that it throws IOException
     */
    void throwException() throws IOException {
        System.out.println("Inside method throwException()");
        throw new IOException("Device Error");
    }

}
