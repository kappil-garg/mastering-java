package com.kapil.masteringjava.basics;

import java.time.Year;
import java.util.Scanner;

/**
 * Program to demonstrate how to take input from the user in Java.
 * Demonstrates reading user input for name and age, with validation checks.
 * For this program, we have set the upper age limit as 100.
 *
 * @author Kapil Garg
 */
public class ReadingUserInputDemo {

    private static final int UPPER_AGE_LIMIT = 100;
    private static final int CURRENT_YEAR = Year.now().getValue();

    public static void main(String[] args) {
        System.out.println("\n*** Reading User Input Demo ***\n");
        Scanner scanner = new Scanner(System.in);
        int age = getValidAge(scanner);
        String name = getValidName(scanner);
        if (name != null) {
            System.out.println("\nHello, " + name + "! You are " + age + " years old.");
        }
        scanner.close();
    }

    /**
     * Prompts the user to enter their year of birth and calculates their age.
     * Validates the input to ensure it is a numeric value and within a reasonable range.
     *
     * @param scanner Scanner object for reading user input
     * @return Validated age of the user
     */
    private static int getValidAge(Scanner scanner) {
        int age = -1;
        while (age < 0 || age > UPPER_AGE_LIMIT) {
            System.out.println("Please enter your Year of Birth:");
            if (scanner.hasNextInt()) {
                int yearOfBirth = scanner.nextInt();
                scanner.nextLine();
                age = CURRENT_YEAR - yearOfBirth;
                if (age < 0 || age > UPPER_AGE_LIMIT) {
                    System.out.println("Invalid birth year. Please try again.\n");
                }
            } else {
                System.out.println("Oops! You have entered a non-numeric value. Please enter a valid year.\n");
                scanner.nextLine();
            }
        }
        return age;
    }

    /**
     * Prompts the user to enter their name and validates the input.
     *
     * @param scanner Scanner object for reading user input
     * @return Validated name of the user
     */
    private static String getValidName(Scanner scanner) {
        String name = null;
        while (name == null || name.trim().isEmpty()) {
            System.out.println("Please enter your Name:");
            name = scanner.nextLine();
            if (name.trim().isEmpty()) {
                System.out.println("Invalid name. Please enter a valid name.");
            }
        }
        return name;
    }

}
