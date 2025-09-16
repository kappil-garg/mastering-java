package com.kapil.masteringjava.oop;

/**
 * Program to demonstrate Method Overriding in Java.
 * Demonstrates how a subclass can provide a specific implementation of a method.
 *
 * @author Kapil Garg
 */
public class MethodOverridingDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Method Overriding Demo ***\n");

        Bike bike = new Bike();
        bike.start();
        bike.display();
        System.out.println("Bike's Speed Limit :: " + bike.speedLimit);
        System.out.println("Bike's Engine Capacity :: " + bike.engineCapacity);

        Vehicle vehicle = new Vehicle();
        vehicle.start();
        System.out.println("Vehicle's Speed :: " + vehicle.speedLimit);

    }

}

class Vehicle {

    int speedLimit = 60;

    void start() {
        System.out.println("\nStarting Vehicle Engine. Prepare to drive!");
    }

}

class Bike extends Vehicle {

    int speedLimit = 80;
    int engineCapacity = 200;

    @Override
    void start() {
        System.out.println("Bike Engine started. Ready to ride!");
    }

    void display() {
        System.out.println("Displaying bike specifications.");
    }

}
