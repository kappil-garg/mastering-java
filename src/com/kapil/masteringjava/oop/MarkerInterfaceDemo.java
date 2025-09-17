package com.kapil.masteringjava.oop;

/**
 * Program to demonstrate Marker Interfaces in Java.
 * Demonstrates how marker interfaces can be used to indicate that a class has a specific property or behavior.
 *
 * @author Kapil Garg
 */
@SuppressWarnings("All")
public class MarkerInterfaceDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Marker Interface Demo ***\n");

        Document document = new Document("Printable is a Marker Interface");

        if (document instanceof Printable) {
            System.out.println("Current document is Printable.");
            document.print();
            document.incrementAccessCount();
        } else {
            System.out.println("Current document is not printable.");
        }

        System.out.println("Document access count :: " + document.getAccessCount());

    }

}

interface Printable {

}

class Document implements Printable {

    private int accessCount;
    private final String content;

    public Document(String content) {
        this.content = content;
    }

    public void print() {
        System.out.println("\nPrinting the document :: " + this.content);
    }

    public int getAccessCount() {
        return accessCount;
    }

    public void incrementAccessCount() {
        ++accessCount;
    }

}
