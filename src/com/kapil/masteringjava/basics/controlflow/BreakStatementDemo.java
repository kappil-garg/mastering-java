package com.kapil.masteringjava.basics.controlflow;

/**
 * Program to demonstrate the labeled and unlabeled break statements in Java.
 * Demonstrates how to use break statements to exit loops prematurely.
 *
 * @author Kapil Garg
 */
public class BreakStatementDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Unlabeled Break Demo ***\n");
        unlabeledBreakDemo();

        System.out.println("\n*** Labeled Break Demo ***\n");
        labeledBreakDemo();

    }

    /**
     * Demonstrates an unlabeled break statement that exits the inner loop when a condition is met.
     * The outer loop continues its iterations normally.
     */
    private static void unlabeledBreakDemo() {
        for (int i = 1; i < 5; i++) {
            System.out.println("Outer loop started.");
            System.out.println("Outer loop iteration :: #" + i);
            for (int j = 1; j < 5; j++) {
                if (i == 3) {
                    System.out.println("Unlabeled break triggered. Exiting inner loop.");
                    break;
                }
                System.out.println("Inner loop iteration :: #" + j);
            }
            System.out.println("Outer loop ended.\n");
        }
        System.out.println("All iterations of the outer loop completed.");
    }

    /**
     * Demonstrates a labeled break statement that exits both the inner and outer loops when a condition is met.
     * The program continues execution after the labeled break.
     */
    private static void labeledBreakDemo() {
        LBS:
        for (int i = 1; i < 5; i++) {
            System.out.println("Outer loop started.");
            System.out.println("Outer loop iteration :: #" + i);
            for (int j = 1; j < 5; j++) {
                if (i == 3) {
                    System.out.println("Labeled break triggered. Exiting both loops.");
                    break LBS;
                }
                System.out.println("Inner loop iteration :: #" + j);
            }
            System.out.println("Outer loop ended.\n");
        }
        System.out.println("Program execution continues normally after the labeled break.");
    }

}
