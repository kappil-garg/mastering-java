package com.kapil.masteringjava.basics.controlflow;

/**
 * Program to demonstrate for, while, and do-while loops in Java.
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

    private static void forLoopDemo() {
        for (int i = 1; i < 4; i++) {
            System.out.println("Value of i is :: " + i);
        }
    }

    private static void whileLoopDemo() {
        int i = 1;
        while (i < 4) {
            System.out.println("Value of i is :: " + i);
            i++;
        }
    }

    private static void doWhileLoopDemo() {
        int i = 1;
        do {
            System.out.println("Value of i is :: " + i);
            i++;
        } while (i < 4);
    }

    private static void doWhileEdgeCaseDemo() {
        int i = 5;
        do {
            System.out.println("Value of i is :: " + i + " (Executed once even though condition is false)");
        } while (i < 4);
    }

}
