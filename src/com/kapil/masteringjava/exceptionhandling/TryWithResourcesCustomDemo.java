package com.kapil.masteringjava.exceptionhandling;

import java.io.IOException;

/**
 * Program to demonstrate try-with-resources with custom resource and custom exception in Java.
 * Demonstrates how to create a custom resource that implements AutoCloseable and handle exceptions.
 *
 * @author Kapil Garg
 */
public class TryWithResourcesCustomDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Try-With-Resources with Custom Resource and Exception Demo ***\n");

        try (CustomResource resource = new CustomResource()) {
            System.out.println("CustomResource is being used...");
            resource.use();
        } catch (CustomResourceException | IOException e) {
            System.out.println("Exception handled in TryWithResourcesCustomDemo :: " + e.getClass().getName());
            System.out.println("Exception message :: " + e.getMessage());
            for (Throwable suppressed : e.getSuppressed()) {
                System.out.println("Suppressed Exception :: " + suppressed);
            }
        }

    }

}

/**
 * Custom resource class that implements AutoCloseable.
 */
class CustomResource implements AutoCloseable {

    @Override
    public void close() throws IOException {
        System.out.println("CustomResource closed");
        throw new IOException("Error occurred while closing CustomResource");
    }

    public void use() throws CustomResourceException {
        System.out.println("Using CustomResource...");
        throw new CustomResourceException("Error while using resource");
    }

}

/**
 * Custom exception class to represent exceptions specific to CustomResource.
 */
class CustomResourceException extends Exception {

    public CustomResourceException(String message) {
        super(message);
    }

}
