package com.kapil.masteringjava.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Program to demonstrate try statement without catch or finally block.
 * Demonstrates the use of try-with-resources statement without catch or finally block.
 *
 * @author Kapil Garg
 */
public class TryWithoutCatchAndFinallyDemo {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("\n*** Try Without Catch And Finally Demo ***\n");
        try (Scanner scanner = new Scanner(new File("src/resources/Obito.txt"))) {
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        }
    }

}
