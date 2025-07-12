package com.kapil.masteringjava.basics.operators;

/**
 * Program to demonstrate the Logical AND (&&) Operator in Java.
 * Demonstrates practical use of && for evaluating marks and determining results.
 *
 * @author Kapil Garg
 */
public class LogicalAndOperatorDemo {

    public static void main(String[] args) {
        System.out.println("\n*** Logical AND Operator Demo ***\n");
        logicalAndOperatorDemo(93);
        logicalAndOperatorDemo(35);
        logicalAndOperatorDemo(74);
        logicalAndOperatorDemo(17);
        logicalAndOperatorDemo(99);
    }

    private static void logicalAndOperatorDemo(int score) {
        if (score <= 100 && score > 80) {
            System.out.println("Marks :: " + score + " || Result :: First Division");
        } else if (score <= 80 && score > 50) {
            System.out.println("Marks :: " + score + " || Result :: Second Division");
        } else if (score <= 50 && score >= 33) {
            System.out.println("Marks :: " + score + " || Result :: Pass");
        } else {
            System.out.println("Marks :: " + score + " || Result :: Fail");
        }
    }

}
