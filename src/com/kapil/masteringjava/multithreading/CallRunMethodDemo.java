package com.kapil.masteringjava.multithreading;

/**
 * Program to demonstrate the difference between calling the run() method and start() method of a thread in Java.
 * Demonstartes that calling the run() method directly does not create a new thread.
 *
 * @author Kapil Garg
 */
@SuppressWarnings("All")
public class CallRunMethodDemo {

    public static void main(String[] args) {
        System.out.println("\n*** Call Run Method Demo ***\n");
        RunDemo obj1 = new RunDemo();
        RunDemo obj2 = new RunDemo();
        obj1.run();
        obj2.run();
    }

}

class RunDemo extends Thread {

    @Override
    public void run() {
        System.out.println("Thread Name :: " + Thread.currentThread().getName());
        for (int i = 1; i < 3; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Exception ::  " + e.getMessage());
            }
            System.out.println(i);
        }
    }

}
