package com.kapil.masteringjava.basics.operators;

/**
 * Program to demonstrate the Shorthand Assignment Operators in Java.
 * Demonstrates shorthand operations on int and byte types, including implicit and explicit casting scenarios.
 *
 * @author Kapil Garg
 */
@SuppressWarnings("lossy-conversions")
public class ShorthandOperatorsDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Shorthand Assignment Operators Demo with Integers ***\n");
        performIntegerOperations();

        System.out.println("\n*** Shorthand Assignment Operators Demo with Bytes ***\n");
        performByteOperations();

        System.out.println("\n*** Shorthand Assignment Operators Demo with Explicit Casting ***\n");
        performExplicitCasting();

    }

    /**
     * Demonstrates shorthand assignment operations on integer variables.
     * Shows addition, subtraction, and multiplication using shorthand operators.
     */
    private static void performIntegerOperations() {
        int i = 1, j = 8, k = 5;
        System.out.printf("Initial values of i, j, and k :: %d, %d & %d\n", i, j, k);
        i += 2;
        System.out.printf("i += 2 :: %d\n", i);
        j -= 4;
        System.out.printf("j -= 4 :: %d\n", j);
        k *= 3;
        System.out.printf("k *= 3 :: %d\n", k);
    }

    /**
     * Demonstrates shorthand assignment operations on byte variables.
     * Shows multiplication using shorthand operator and highlights implicit casting behavior.
     */
    private static void performByteOperations() {
        byte a = 7, b = 9;
        System.out.printf("Initial values of a and b :: %d & %d\n", a, b);
        a = (byte) (a * 2.6);
        System.out.printf("a = (byte) (a * 2.6) :: %d\n", a);
        b *= 2.6;
        System.out.printf("b *= 2.6 :: %d\n", b);
    }

    /**
     * Demonstrates explicit casting in shorthand assignment operations.
     * Shows how to handle operations that result in a different data type.
     */
    private static void performExplicitCasting() {
        int x = 10;
        System.out.printf("Initial value of x :: %d\n", x);
        x = (int) (x - 5.5);
        System.out.printf("x = (int) (x - 5.5) :: %d\n", x);
    }

}
