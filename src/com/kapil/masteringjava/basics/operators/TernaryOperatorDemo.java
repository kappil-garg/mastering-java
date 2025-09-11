package com.kapil.masteringjava.basics.operators;

/**
 * Program to demonstrate the Ternary Operator in Java.
 * Demonstrates conditional evaluation using the ternary (?:) operator.
 * If firstNumber >= secondNumber → subtraction (including equality), else → addition.
 *
 * @author Kapil Garg
 */
public class TernaryOperatorDemo {

    public static void main(String[] args) {
        System.out.println("\n*** Ternary Operator Demo ***\n");
        ternaryOperationDemo(5, 1);
        ternaryOperationDemo(3, 4);
        ternaryOperationDemo(0, 0);
    }

    /**
     * Demonstrates the ternary operation based on the comparison of two integers.
     * If firstNumber is greater than or equal to secondNumber, it performs subtraction; otherwise, it performs addition.
     *
     * @param firstNumber  The first integer
     * @param secondNumber The second integer
     */
    private static void ternaryOperationDemo(int firstNumber, int secondNumber) {
        int result = (firstNumber >= secondNumber) ? (firstNumber - secondNumber) : (firstNumber + secondNumber);
        System.out.printf("Inputs: %d, %d | Result : %d\n", firstNumber, secondNumber, result);
    }

}
