package com.kapil.masteringjava.basics.controlflow;

/**
 * Program to demonstrate infinite for loop in Java.
 * Demonstrates different ways to create infinite loops with a controlled termination.
 *
 * @author Kapil Garg
 */
@SuppressWarnings("All")
public class InfiniteForLoopDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Infinite Loop with Condition ***\n");
        infiniteLoopWithCondition();

        System.out.println("\n*** Infinite Loop with Empty Condition ***\n");
        infiniteLoopWithNoCondition();

        System.out.println("\n*** Infinite Loop with True Condition ***\n");
        infiniteLoopWithTrueCondition();

    }

    /**
     * Demonstrates an infinite loop with a condition that normally wouldn't stop.
     * It is manually terminated with a break condition.
     */
    private static void infiniteLoopWithCondition() {
        int counter = 0;
        for (int i = 10; i > 5; i++) {
            if (counter++ == 5) {
                break;
            }
            System.out.println("Ted Mosby");
        }
    }

    /**
     * Demonstrates an infinite loop using an empty condition.
     * It runs indefinitely unless explicitly broken.
     */
    private static void infiniteLoopWithNoCondition() {
        int counter = 0;
        for (; ; ) {
            if (counter++ == 5) {
                break;
            }
            System.out.println("Obito Uchiha");
        }
    }

    /**
     * Demonstrates an infinite loop using "true" inside the for loop condition.
     * It runs indefinitely unless explicitly broken.
     */
    private static void infiniteLoopWithTrueCondition() {
        int counter = 0;
        for (; true; ) {
            if (counter++ == 5) {
                break;
            }
            System.out.println("Dexter Morgan");
        }
    }

}
