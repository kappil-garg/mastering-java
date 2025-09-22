package com.kapil.masteringjava.strings;

/**
 * Program to demonstrate the usage of StringBuilder Class in Java.
 * Demonstrates how to create and manipulate StringBuilder objects, which are mutable but not thread-safe.
 *
 * @author Kapil Garg
 */
@SuppressWarnings("All")
public class StringBuilderDemo {

    public static void main(String[] args) {

        System.out.println("\n*** StringBuilder Class Demo ***\n");
        stringBuilderDemo();

        System.out.println("\n*** StringBuilder Class Equality Check Demo ***\n");
        equalityCheckWithStringBuilder();

    }

    /**
     * Demonstrates the usage of StringBuilder class in Java.
     * Shows how to create a StringBuilder, append text to it, and print the final string.
     */
    private static void stringBuilderDemo() {
        StringBuilder sb = new StringBuilder("Hello, ");
        System.out.println("Input String :: " + sb);
        sb.append("Java!!!");
        System.out.println("Final String :: " + sb);
    }

    /**
     * Demonstrates equality checks between two StringBuilder objects.
     * Shows the difference between using the equality operator (==) and the equals() method.
     */
    private static void equalityCheckWithStringBuilder() {
        StringBuilder sb1 = new StringBuilder("Hello ");
        System.out.println("String sb1 :: " + sb1);
        StringBuilder sb2 = new StringBuilder("Hello ");
        System.out.println("String sb2 :: " + sb2);
        System.out.println("\nsb1 == sb2 :: " + (sb1 == sb2));
        System.out.println("sb1.equals(sb2) :: " + sb1.equals(sb2));
        System.out.println("sb1.toString().equals(sb2.toString()) :: " + sb1.toString().equals(sb2.toString()));
    }

}
