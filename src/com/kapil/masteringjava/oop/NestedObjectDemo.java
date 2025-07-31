package com.kapil.masteringjava.oop;

/**
 * Program to understand Nested Object in Java.
 * Demonstrates how a class can contain an instance of another class as a member.
 *
 * @author Kapil Garg
 */
public class NestedObjectDemo {

    public static void main(String[] args) {
        System.out.println("\n*** Nested Object Demo ***\n");
        Truck truck = new Truck();
        truck.startTransport();
    }

}

class Engine {

    private final int horsepower;

    public Engine(int horsepower) {
        this.horsepower = horsepower;
    }

    void start() {
        System.out.println("Engine started with " + horsepower + " HP.");
    }

}

class Truck {

    private final Engine engine;

    public Truck() {
        this.engine = new Engine(400);
    }

    void startTransport() {
        engine.start();
        System.out.println("Truck is now hauling cargo.");
    }

}
