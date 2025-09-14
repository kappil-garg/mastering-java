package com.kapil.masteringjava.oop;

/**
 * Program to demonstrate Constructor Overloading in Java.
 * Demonstrates how overloaded constructors handle multiple initialization scenarios.
 *
 * @author Kapil Garg
 */
public class ConstructorOverloadingDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Constructor Overloading Demo ***");

        System.out.println("\n*** Hyundai Car Details ***\n");
        Car hyundai = new Car("Hyundai ", "Ioniq 7");
        hyundai.display();

        System.out.println("\n*** Tata Motors Car Details ***\n");
        Car tataMotors = new Car("Tata Motors", "Nexon EV", 2022);
        tataMotors.display();

    }

}

class Car {

    private final String brandName;
    private final String modelName;

    private int releaseYear = 2025;

    Car(String brandName, String modelName) {
        this.brandName = brandName;
        this.modelName = modelName;
    }

    Car(String brandName, String modelName, int releaseYear) {
        this.brandName = brandName;
        this.modelName = modelName;
        this.releaseYear = releaseYear;
    }

    void display() {
        System.out.println("Brand Name :: " + brandName);
        System.out.println("Model Name :: " + modelName);
        System.out.println("Release Year :: " + releaseYear);
    }

}
