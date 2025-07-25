package com.kapil.masteringjava.basics.controlflow;

/**
 * Program to demonstrate the labeled and unlabeled continue statements in Java.
 * Demonstrates how to use continue statements to skip the current iteration of a loop.
 *
 * @author Kapil Garg
 */
public class ContinueStatementDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Unlabeled Continue Demo ***\n");
        unlabeledContinueDemo();

        System.out.println("\n*** Labeled Continue Demo ***\n");
        labeledContinueDemo();

    }

    private static void unlabeledContinueDemo() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Outer loop started.");
            System.out.println("Outer loop iteration :: #" + i);
            for (int j = 0; j < 5; j++) {
                if (j == 3) {
                    System.out.println("Unlabeled continue triggered. Skipping current iteration of inner loop.");
                    continue;
                }
                System.out.println("Inner loop iteration :: #" + j);
            }
            System.out.println("Outer loop ended.\n");
        }
        System.out.println("Loops finished execution.");
    }

    private static void labeledContinueDemo() {
        LCS:
        for (int i = 0; i < 3; i++) {
            System.out.println("Outer loop started.");
            System.out.println("Outer loop iteration :: #" + i);
            for (int j = 0; j < 5; j++) {
                if (j == 3) {
                    System.out.println("Labeled continue triggered. Skipping remaining iterations of inner loop.");
                    continue LCS;
                }
                System.out.println("Inner loop iteration :: #" + j);
            }
            System.out.println("Outer loop ended.\n");
        }
        System.out.println("Loops finished execution.");
    }

}
