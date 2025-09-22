package com.kapil.masteringjava.strings;

/**
 * Program to demonstrate the usage of StringBuffer Class in Java.
 * Demonstrates how to create and manipulate StringBuffer objects, which are mutable and thread-safe.
 *
 * @author Kapil Garg
 */
@SuppressWarnings("All")
public class StringBufferDemo {

    public static void main(String[] args) {

        System.out.println("\n*** StringBuffer Class Demo ***\n");
        stringBufferDemo();

        System.out.println("\n*** StringBuffer Class Equality Check Demo ***\n");
        equalityCheckWithStringBuffer();

    }

    /**
     * Demonstrates the usage of StringBuffer class in Java.
     * Shows how to create a StringBuffer, append text to it, and print the final string.
     */
    private static void stringBufferDemo() {
        StringBuffer sb = new StringBuffer("Hello, ");
        System.out.println("Input String :: " + sb);
        sb.append("Java!!!");
        System.out.println("Final String :: " + sb);
    }

    /**
     * Demonstrates equality checks between two StringBuffer objects.
     * Shows the difference between using the equality operator (==) and the equals() method.
     */
    private static void equalityCheckWithStringBuffer() {
        StringBuffer sb1 = new StringBuffer("Hello ");
        System.out.println("String sb1 :: " + sb1);
        StringBuffer sb2 = new StringBuffer("Hello ");
        System.out.println("String sb2 :: " + sb2);
        System.out.println("\nsb1 == sb2 :: " + (sb1 == sb2));
        System.out.println("sb1.equals(sb2) :: " + sb1.equals(sb2));
        System.out.println("sb1.toString().equals(sb2.toString()) :: " + sb1.toString().equals(sb2.toString()));
    }

}
