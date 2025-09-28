package com.kapil.masteringjava.multithreading;

/**
 * Program to demonstrate the main thread in Java.
 * Demonstrates how to get and set the name of the main thread, and how to pause its execution using sleep().
 * For more visible effect, you can increase the sleep time from 1000 to 10000 or a number of your choice.
 *
 * @author Kapil Garg
 */
public class MainThreadDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Main Thread Demo ***\n");

        Thread thread = Thread.currentThread();
        System.out.println("Main Thread :: " + thread.getName());
        thread.setName("MainThreadDemo");
        System.out.println("Current Thread :: " + thread.getName());

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(i + 1);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread is interrupted");
        }

        System.out.println("Exiting the main thread");

    }

}
