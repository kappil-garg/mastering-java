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
        Car audi = new Car("Hyundai ", "Ioniq 7");
        audi.display();

        System.out.println("\n*** Tata Motors Car Details ***\n");
        Car honda = new Car("Tata Motors", "Nexon EV", 2022);
        honda.display();

    }

}

class Car {

    private final String brandName;
    private final String modelName;

    private final int releaseYear;

    Car(String brandName, String modelName) {
        this.brandName = brandName;
        this.modelName = modelName;
        this.releaseYear = 2025;
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
