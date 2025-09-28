package com.kapil.masteringjava.multithreading;

/**
 * Program to demonstrate thread priority in Java.
 * Demonstrates how to get and set thread priorities using getPriority() and setPriority() methods.
 *
 * @author Kapil Garg
 */
public class ThreadPriorityDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Thread Priority Demo ***\n");

        ThreadPriority t1 = new ThreadPriority();
        System.out.println("Priority of Thread t1 :: " + t1.getPriority());

        ThreadPriority t2 = new ThreadPriority();
        System.out.println("Priority of Thread t2 :: " + t2.getPriority());

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();

    }

}

class ThreadPriority extends Thread {

    @Override
    public void run() {
        System.out.println("Name of Running Thread : " + Thread.currentThread().getName());
        System.out.println("Priority of Running Thread : " + Thread.currentThread().getPriority());
    }

}
