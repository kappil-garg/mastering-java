package com.kapil.masteringjava.basics.controlflow;

/**
 * Program to demonstrate If-Else in Java.
 * Demonstrates how to use if-else statements to control the flow of execution based on conditions.
 *
 * @author Kapil Garg
 */
public class IfElseDemo {

    public static void main(String[] args) {
        System.out.println("\n*** If-Else Demo ***\n");
        printNumberUsingIfElse(1);
        printNumberUsingIfElse(9);
        printNumberUsingIfElse(0);
    }

    private static void printNumberUsingIfElse(int number) {
        if (number == 0) {
            System.out.println("The number is :: 0");
        } else if (number == 1) {
            System.out.println("The number is :: 1");
        } else {
            System.out.println("The number is :: " + number);
        }
    }

}
