package com.kapil.masteringjava.basics;

/**
 * Program to demonstrate how to print ASCII values of characters in Java.
 * Demonstrates ASCII values for uppercase letters, lowercase letters, digits, and special characters.
 *
 * @author Kapil Garg
 */
public class AsciiValueDemo {

    public static void main(String[] args) {
        System.out.println("\n*** ASCII Value Demo ***\n");
        printAsciiValue('A');
        printAsciiValue('c');
        printAsciiValue('5');
        printAsciiValue('9');
        printAsciiValue('$');
        printAsciiValue('@');
    }

    private static void printAsciiValue(char character) {
        System.out.printf("Character :: '%c' || ASCII Value :: %d%n", character, (int) character);
    }

}
