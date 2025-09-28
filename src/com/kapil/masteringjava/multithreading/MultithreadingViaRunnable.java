package com.kapil.masteringjava.multithreading;

/**
 * Program to demonstrate multithreading using Runnable interface in Java.
 * Demonstrates creating multiple threads by implementing the Runnable interface and overriding the run() method.
 *
 * @author Kapil Garg
 */
public class MultithreadingViaRunnable {

    public static void main(String[] args) {
        System.out.println("\n*** Multithreading via Runnable Interface Demo ***\n");
        int numberOfThreads = 7;
        for (int i = 0; i < numberOfThreads; i++) {
            Thread object = new Thread(new RunnableDemo());
            object.start();
        }
    }

}

@SuppressWarnings("All")
class RunnableDemo implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println("Thread with Id = " + Thread.currentThread().getId() + " is running!");
        } catch (Exception e) {
            System.out.println("Exception Handled :: " + e.getMessage());
        }
    }

}
