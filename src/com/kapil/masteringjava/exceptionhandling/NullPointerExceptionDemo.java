package com.kapil.masteringjava.exceptionhandling;

/**
 * Program to demonstrate NullPointerException in Java.
 * Demonstrates how to handle NullPointerException using try-catch block.
 *
 * @author Kapil Garg
 */
@SuppressWarnings("All")
public class NullPointerExceptionDemo {

    public static void main(String[] args) {
        System.out.println("\n*** NullPointerException Demo ***\n");
        Book book = new Book("Mastering Java");
        book.printTitle();
        book = null;
        try {
            book.printTitle();
        } catch (NullPointerException e) {
            System.out.println("Exception occurred in NullPointerExceptionDemo :: " + e.getMessage());
        }
        System.out.println("Program continues in normal flow...");
    }

}

class Book {

    String bookTitle;

    Book(String bookTitle) {
        System.out.println("Hello from class Book :: ");
        this.bookTitle = bookTitle;
    }

    void printTitle() {
        System.out.println("Book Title :: " + this.bookTitle);
    }

}
