package com.kapil.masteringjava.multithreading;

/**
 * Program to demonstrate the sleep() method in Java.
 * Demonstrates how to pause the execution of a thread for a specified duration using the sleep() method.
 *
 * @author Kapil Garg
 */
public class SleepMethodDemo {

    public static void main(String[] args) {
        System.out.println("\n*** Sleep Method Demo ***\n");
        SleepDemo obj1 = new SleepDemo();
        SleepDemo obj2 = new SleepDemo();
        obj1.start();
        obj2.start();
    }

}

@SuppressWarnings("All")
class SleepDemo extends Thread {

    @Override
    public void run() {
        for(int i = 1; i < 3; i++) {
            try {
                System.out.println("Thread with Id = " + Thread.currentThread().getId() + " is running!");
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                System.out.println("Exception Handled :: " + e.getMessage());
            }
            System.out.println(i);
        }
    }

}
