package com.kapil.masteringjava.basics.controlflow;

/**
 * Program to demonstrate the labeled and unlabeled break statements in Java.
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
