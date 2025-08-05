package com.kapil.masteringjava.basics;

/**
 * Program to demonstrate Type Casting in Java.
 * Demonstrates how type casting works using implicit and explicit conversion.
 *
 * @author Kapil Garg
 */
public class CastingDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Upcasting Demo ***\n");
        upcastingDemo();

        System.out.println("\n*** Downcasting Demo ***\n");
        downcastingDemo();

    }

    /**
     * Demonstrates upcasting from byte to int.
     * This is implicit (automatic) since int has a wider range than byte.
     */
    private static void upcastingDemo() {
        int intValue;
        byte byteValue = 23;
        intValue = byteValue;
        System.out.println("Input (byte value) :: " + byteValue);
        System.out.println("Output (int value) :: " + intValue);
    }

    /**
     * Demonstrates downcasting from double to int.
     * This is explicit (manual) since double has a wider range and higher precision than int.
     */
    private static void downcastingDemo() {
        double doubleValue = 10.99;
        int intValue = (int) doubleValue;
        System.out.println("Input (double value) :: " + doubleValue);
        System.out.println("Output (int value) :: " + intValue);
        int firstIntValue = 5;
        int secondIntValue = 2;
        double doubleOutput = (double) firstIntValue / secondIntValue;
        System.out.println("\nInput (int values) :: " + firstIntValue + " & " + secondIntValue);
        System.out.println("Output (5 / 2 as double) :: " + doubleOutput);
    }

}
