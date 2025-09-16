package com.kapil.masteringjava.oop;

/**
 * Program to demonstrate Initialize Block in Java.
 * Demonstrates how to use an 'initialize' block to set default values for instance variables.
 *
 * @author Kapil Garg
 */
public class InitializeBlockDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Initialize Block Demo ***");

        Architect architect = new Architect();
        architect.show();

        Architect tedMosby = new Architect("Ted Mosby", 30);
        tedMosby.show();

    }

}

class Architect {

    private int age;

    private String name;
    private final String profession;

    // Initialize block
    {
        profession = "Architect";
        System.out.println("\nHello from Initialize block");
    }

    Architect() {
        System.out.println("Hello from constructor");
    }

    Architect(String name, int age) {
        System.out.println("Hello from parametrized constructor");
        this.name = name;
        this.age = age;
    }

    void show() {
        System.out.println("\nDisplaying Architect's Information:");
        System.out.println("Name :: " + name + " || Age :: " + age + " || Profession :: " + profession);
    }

}
