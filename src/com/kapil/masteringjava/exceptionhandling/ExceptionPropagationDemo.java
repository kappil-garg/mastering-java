package com.kapil.masteringjava.exceptionhandling;

/**
 * Program to demonstrate propagation of Unchecked Exception in Java.
 * Demonstrates how unchecked exceptions propagate through the call stack until caught or terminate the program.
 *
 * @author Kapil Garg
 */
@SuppressWarnings("All")
public class ExceptionPropagationDemo {

    public static void main(String[] args) {
        System.out.println("\n*** Exception Propagation Demo ***\n");
        ExceptionPropagationDemo obj = new ExceptionPropagationDemo();
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
            System.out.println("Exception handled in handleException() method :: " + e);
        }
    }

    /**
     * Method callThrowingMethod() calls method throwException()
     */
    void callThrowingMethod() {
        System.out.println("Inside method callThrowingMethod()");
        throwException();
    }

    /**
     * Method throwException() throws ArithmeticException (unchecked exception)
     */
    void throwException() {
        System.out.println("Inside method throwException()");
        int data = 50/0;
    }

}
