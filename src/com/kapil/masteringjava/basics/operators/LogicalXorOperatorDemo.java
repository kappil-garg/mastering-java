package com.kapil.masteringjava.basics.operators;

/**
 * Program to demonstrate the Logical XOR (^) Operator in Java.
 * Demonstrates practical use of Logical XOR (Exclusive OR) for evaluating exclusive conditions.
 *
 * @author Kapil Garg
 */
@SuppressWarnings("All")
public class LogicalXorOperatorDemo {

    public static void main(String[] args) {
        System.out.println("\n*** Logical XOR Operator Demo ***\n");
        logicalXOROperator(true, false);
        logicalXOROperator(true, true);
        logicalXOROperator(false, true);
        logicalXOROperator(false, false);
    }

    /**
     * Demonstrates the use of the logical XOR operator to evaluate two boolean flags and determine if exactly one is true.
     * Uses the XOR operator to check for exclusive conditions.
     *
     * @param flagOne The first boolean flag
     * @param flagTwo The second boolean flag
     */
    private static void logicalXOROperator(boolean flagOne, boolean flagTwo) {
        boolean result = flagOne ^ flagTwo;
        System.out.printf("Input A: %-5b | Input B: %-5b | A ^ B = %-5b => %s%n",
                flagOne, flagTwo, result,
                result ? "Exclusive Condition Met" : "No Exclusive Condition"
        );
    }

}
