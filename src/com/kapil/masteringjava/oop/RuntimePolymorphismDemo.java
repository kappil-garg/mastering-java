package com.kapil.masteringjava.oop;

/**
 * Program to demonstrate Runtime Polymorphism in Java.
 * Demonstrates runtime polymorphism using method overriding.
 *
 * @author Kapil Garg
 */
public class RuntimePolymorphismDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Runtime Polymorphism Demo ***\n");

        Bank bank = new Bank();
        bank.credit();

        bank = new AxisBank();
        bank.credit();

        bank = new CitiBank();
        bank.credit();

    }

}

class Bank {

    void credit() {
        System.out.println("Hello from credit() :: Bank");
    }

}

class AxisBank extends Bank {

    @Override
    void credit() {
        System.out.println("Hello from credit() :: AxisBank");
    }

}

class CitiBank extends Bank {

    @Override
    void credit() {
        System.out.println("Hello from credit() :: CitiBank");
    }

}
