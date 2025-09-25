package com.kapil.masteringjava.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Program to demonstrate try-with-resources in Java.
 * Demonstrates the use of try-with-resources statement for automatic resource management.
 *
 * @author Kapil Garg
 */
public class TryWithResourcesDemo {

    public static void main(String[] args) {
        System.out.println("\n*** Try With Resources Demo ***\n");
        tryWithResourcesDemo1();
        tryWithResourcesDemo2();
    }

    /**
     * Demonstrates try-with-resources with a single resource (Scanner).
     * Reads and prints lines from a file.
     */
    private static void tryWithResourcesDemo1() {
        try (Scanner scanner = new Scanner(new File("src/resources/Ted.txt"))) {
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException exception) {
            System.out.println(exception.getLocalizedMessage());
        }
    }

    /**
     * Demonstrates try-with-resources with multiple resources (Scanner and PrintWriter).
     * Reads from one file and writes its content to another file.
     */
    private static void tryWithResourcesDemo2() {
        try (Scanner scanner = new Scanner(new File("src/resources/Obito.txt"));
             PrintWriter writer = new PrintWriter("src/resources/Output-EH.txt")) {
            while (scanner.hasNext()) {
                writer.print(scanner.nextLine());
            }
        } catch (FileNotFoundException exception) {
            System.out.println(exception.getLocalizedMessage());
        }
    }

}
