package com.kapil.masteringjava.multithreading;

/**
 * Program to demonstrate multithreading using Thread class in Java.
 * Demonstrates creating multiple threads by extending the Thread class and overriding the run() method.
 *
 * @author Kapil Garg
 */
public class MultithreadingViaThreadClass {

    public static void main(String[] args) {
        System.out.println("\n*** Multithreading via Thread Class Demo ***\n");
        int numberOfThreads = 5;
        for (int i = 0; i < numberOfThreads; i++) {
            ThreadDemo object = new ThreadDemo();
            object.start();
        }
    }

}

@SuppressWarnings("All")
class ThreadDemo extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("Thread with Id = " + Thread.currentThread().getId() + " is running!");
        } catch (Exception e) {
            System.out.println("Exception Handled :: " + e.getMessage());
        }
    }

}
