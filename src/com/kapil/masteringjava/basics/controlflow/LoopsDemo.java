package com.kapil.masteringjava.basics.controlflow;

/**
 * Program to demonstrate for, while, and do-while loops in Java.
 * Demonstrates how to use different types of loops to control the flow of execution based on conditions.
 *
 * @author Kapil Garg
 */
@SuppressWarnings("All")
public class LoopsDemo {

    public static void main(String[] args) {

        System.out.println("\n*** For Loop Demo ***\n");
        forLoopDemo();

        System.out.println("\n*** While Loop Demo ***\n");
        whileLoopDemo();

        System.out.println("\n*** Do-While Loop Demo ***\n");
        doWhileLoopDemo();

        System.out.println("\n*** Edge Case for Do-While Loop ***\n");
        doWhileEdgeCaseDemo();

    }

    /**
     * Demonstrates a for loop that iterates from 1 to 3.
     */
    private static void forLoopDemo() {
        for (int i = 1; i < 4; i++) {
            System.out.println("Value of i is :: " + i);
        }
    }

    /**
     * Demonstrates a while loop that iterates while the condition is true.
     * It prints the value of i from 1 to 3.
     */
    private static void whileLoopDemo() {
        int i = 1;
        while (i < 4) {
            System.out.println("Value of i is :: " + i);
            i++;
        }
    }

    /**
     * Demonstrates a do-while loop that executes at least once.
     * It prints the value of i from 1 to 3.
     */
    private static void doWhileLoopDemo() {
        int i = 1;
        do {
            System.out.println("Value of i is :: " + i);
            i++;
        } while (i < 4);
    }

    /**
     * Demonstrates an edge case for a do-while loop where the condition is false.
     * The loop executes once before checking the condition.
     */
    private static void doWhileEdgeCaseDemo() {
        int i = 5;
        do {
            System.out.println("Value of i is :: " + i + " (Executed once even though condition is false)");
        } while (i < 4);
    }

}
