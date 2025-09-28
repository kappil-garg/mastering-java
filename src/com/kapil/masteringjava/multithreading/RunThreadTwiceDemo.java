package com.kapil.masteringjava.multithreading;

/**
 * Program to demonstrate that a thread cannot be started more than once in Java.
 * Demonstrates that calling start() on an already started thread throws IllegalThreadStateException.
 *
 * @author Kapil Garg
 */
public class RunThreadTwiceDemo {

    public static void main(String[] args) {
        System.out.println("\n*** Run Thread Twice Demo ***\n");
        RunThreadTwice demoThread = new RunThreadTwice();
        demoThread.start();
        demoThread.start();
    }

}

class RunThreadTwice extends Thread {

    @Override
    public void run() {
        System.out.println("Thread is running...");
    }

}
