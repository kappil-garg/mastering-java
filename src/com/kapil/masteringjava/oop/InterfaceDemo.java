package com.kapil.masteringjava.oop;

/**
 * Program to demonstrate Interfaces in Java.
 * Demonstrates how to define and implement interfaces.
 *
 * @author Kapil Garg
 */
public class InterfaceDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Interface Demo ***\n");

        Instrument guitar = new Guitar();
        System.out.println("Instrument :: Guitar || Sound :: " + guitar.play());

        Instrument piano = new Piano();
        System.out.println("Instrument :: Piano || Sound :: " + piano.play());

    }

}

interface Instrument {

    String play();

}

class Guitar implements Instrument {

    @Override
    public String play() {
        return "Strum strum";
    }

}

class Piano implements Instrument {

    @Override
    public String play() {
        return "Plink plonk";
    }

}
