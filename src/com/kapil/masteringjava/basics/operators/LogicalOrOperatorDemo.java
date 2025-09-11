package com.kapil.masteringjava.basics.operators;

/**
 * Program to demonstrate the Logical OR (||) Operator in Java.
 * Demonstrates practical use of || for evaluating pass/fail based on marks.
 *
 * @author Kapil Garg
 */
public class LogicalOrOperatorDemo {

    public static void main(String[] args) {
        System.out.println("\n*** Logical OR Operator Demo ***\n");
        logicalOrOperatorDemo(33);
        logicalOrOperatorDemo(26);
        logicalOrOperatorDemo(97);
        logicalOrOperatorDemo(18);
        logicalOrOperatorDemo(51);
    }

    /**
     * Demonstrates the use of the logical OR operator to evaluate a score and determine if it's a pass or fail.
     * Uses the condition that a score greater than or equal to 33 is considered a pass.
     *
     * @param score The score to be evaluated
     */
    private static void logicalOrOperatorDemo(int score) {
        if (score > 33 || score == 33) {
            System.out.println("Marks :: " + score + " || Result :: Pass");
        } else {
            System.out.println("Marks :: " + score + " || Result :: Fail");
        }
    }

}
