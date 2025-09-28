package com.kapil.masteringjava.multithreading;

/**
 * Program to demonstrate thread naming in Java.
 * Demonstrates how to get and set thread names using getName() and setName() methods.
 *
 * @author Kapil Garg
 */
@SuppressWarnings("All")
public class ThreadNamingDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Thread Naming Demo ***\n");

        ThreadName t1 = new ThreadName();
        System.out.println("Name of t1 :: " + t1.getName());

        ThreadName t2 = new ThreadName();
        System.out.println("Name of t2 :: " + t2.getName());

        t1.start();
        t2.start();

        t1.setName("MyThread-1");
        System.out.println("New name of t1 :: " + t1.getName());

        Thread t3 = new Thread("MyThread-3");
        t3.start();
        System.out.println("Name of t3 :: " + t3.getName());

    }

}

class ThreadName extends Thread {

    @Override
    public void run() {
        System.out.println("Thread is Running...");
    }

}
