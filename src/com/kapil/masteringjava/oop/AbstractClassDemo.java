package com.kapil.masteringjava.oop;

/**
 * Program to demonstrate Abstract Class in Java.
 * Demonstrates how an abstract class can define constructors and abstract methods.
 *
 * @author Kapil Garg
 */
public class AbstractClassDemo {

    public static void main(String[] args) {
        
        System.out.println("\n*** Abstract Class Demo ***");
        
        PaymentMethod creditCard = new CreditCard();
        creditCard.processPayment();
        creditCard.printReceipt();

        PaymentMethod debitCard = new DebitCard();
        debitCard.processPayment();
        debitCard.printReceipt();

    }

}

abstract class PaymentMethod {

    PaymentMethod() {
        System.out.println("\nInitializing payment method.");
    }

    abstract void processPayment();

    void printReceipt() {
        System.out.println("Thank you for shopping with us. Your payment has been processed successfully.");
    }

}

class CreditCard extends PaymentMethod {

    @Override
    void processPayment() {
        System.out.println("Processing payment using Credit Card.");
    }

}

class DebitCard extends PaymentMethod {

    @Override
    void processPayment() {
        System.out.println("Processing payment using Debit Card.");
    }

}
