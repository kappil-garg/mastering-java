package com.kapil.masteringjava.basics.operators;

/**
 * Program to demonstrate the Pre-Post Increment Operator in Java.
 * Demonstrates the difference between pre-increment (++i) and post-increment (i++).
 *
 * @author Kapil Garg
 */
public class PrePostIncrementDemo {

    public static void main(String[] args) {
        System.out.println("\n*** Pre-Post Increment Operator Demo ***\n");
        prePostIncrementDemo();
    }

    /**
     * Demonstrates the behavior of pre-increment and post-increment operators.
     * Shows how the value of the variable changes with each operation.
     */
    private static void prePostIncrementDemo() {

        int i = 4;
        System.out.println("Initial Value of i :: " + i);

        int j = i++;
        System.out.println("\nAfter j = i++ (Post-Increment)");
        System.out.println("Value of i :: " + i);
        System.out.println("Value of j :: " + j);

        int k = ++i;
        System.out.println("\nAfter k = ++i (Pre-Increment)");
        System.out.println("Value of i :: " + i);
        System.out.println("Value of k :: " + k);

        j = i++;
        System.out.println("\nAfter j = i++ (Post-Increment)");
        System.out.println("Value of i :: " + i);
        System.out.println("Value of j :: " + j);

        k = ++i;
        System.out.println("\nAfter k = ++i (Pre-Increment)");
        System.out.println("Value of i :: " + i);
        System.out.println("Value of k :: " + k);

    }

}
