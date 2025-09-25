package com.kapil.masteringjava.exceptionhandling;

/**
 * Program to demonstrate Nested try-catch in Java.
 * Demonstrates a nested try-catch scenario using multiple try-catch blocks.
 *
 * @author Kapil Garg
 */
public class NestedTryCatchDemo {

    public static void main(String[] args) {
        System.out.println("\n*** Nested Try-Catch Demo ***\n");
        nestedTryCatchDemo(18, 3);
        nestedTryCatchDemo(15, 0);
    }

    /**
     * Method to demonstrate nested try-catch scenario.
     *
     * @param a Dividend
     * @param b Divisor
     */
    private static void nestedTryCatchDemo(int a, int b) {
        int c;
        int[] numbers = {4, 7, 9, 14};
        try {
            c = a / b;
            System.out.println("c = " + c);
            try {
                System.out.println(numbers[c]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception occurred :: ArrayIndexOutOfBoundsException");
            }
        } catch (ArithmeticException e) {
            System.out.println("Exception occurred :: ArithmeticException");
        }
    }

}
