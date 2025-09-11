package com.kapil.masteringjava.basics.operators;

/**
 * Program to demonstrate the Pre-Post Decrement Operator in Java.
 * Demonstrates the difference between pre-decrement (--i) and post-decrement (i--).
 *
 * @author Kapil Garg
 */
public class PrePostDecrementDemo {

    public static void main(String[] args) {
        System.out.println("\n*** Pre-Post Decrement Operator Demo ***\n");
        prePostDecrementDemo();
    }

    /**
     * Demonstrates the behavior of pre-decrement and post-decrement operators.
     * Shows how the value of the variable changes with each operation.
     */
    private static void prePostDecrementDemo() {

        int i = 4;
        System.out.println("Initial Value of i :: " + i);

        int j = i--;
        System.out.println("\nAfter j = i-- (Post-Decrement)");
        System.out.println("Value of i :: " + i);
        System.out.println("Value of j :: " + j);

        int k = --i;
        System.out.println("\nAfter k = --i (Pre-Decrement)");
        System.out.println("Value of i :: " + i);
        System.out.println("Value of k :: " + k);

        j = i--;
        System.out.println("\nAfter j = i-- (Post-Decrement)");
        System.out.println("Value of i :: " + i);
        System.out.println("Value of j :: " + j);

        k = --i;
        System.out.println("\nAfter k = --i (Pre-Decrement)");
        System.out.println("Value of i :: " + i);
        System.out.println("Value of k :: " + k);

    }

}
