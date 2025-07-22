package com.kapil.masteringjava.basics.operators;

/**
 * Program to demonstrate the Logical XOR (^) Operator in Java.
 * Demonstrates practical use of Logical XOR (Exclusive OR) for exclusive conditions.
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

    private static void logicalXOROperator(boolean flagOne, boolean flagTwo) {
        boolean result = flagOne ^ flagTwo;
        System.out.printf("Input A: %-5b | Input B: %-5b | A ^ B = %-5b => %s%n",
                flagOne, flagTwo, result,
                result ? "Exclusive Condition Met" : "No Exclusive Condition"
        );
    }

}
