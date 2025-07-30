package com.kapil.masteringjava.oop;

/**
 * Program to understand interfaces in Java.
 * Demonstrates how to define and implement interfaces.
 *
 * @author Kapil Garg
 */
public class InterfaceDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Interface Demo ***\n");

        CarInterface honda = new Honda();
        System.out.println("Brand :: Honda || " + honda.carColour());

        CarInterface skoda = new Skoda();
        System.out.println("Brand :: Skoda || " + skoda.carColour());

    }

}

interface CarInterface {

    String carColour();

}

class Honda implements CarInterface {

    @Override
    public String carColour() {
        return "Car Colour :: Grey";
    }

}

class Skoda implements CarInterface {

    @Override
    public String carColour() {
        return "Car Colour :: Silver";
    }

}
