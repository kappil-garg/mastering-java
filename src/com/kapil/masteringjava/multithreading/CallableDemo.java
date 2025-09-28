package com.kapil.masteringjava.multithreading;

import java.util.concurrent.*;

/**
 * Program to demonstrate the use of Callable and Future in Java.
 * Demonstrates how to create a Callable task, submit it to an ExecutorService, and retrieve the result using Future.
 *
 * @author Kapil Garg
 */
public class CallableDemo {

    public static void main(String[] args) {
        System.out.println("\n*** Callable and Future Demo ***\n");
        try (ExecutorService executorService = Executors.newFixedThreadPool(2)) {
            Future<Long> future1 = executorService.submit(new FactorialCalculator(9));
            Future<Long> future2 = executorService.submit(new FactorialCalculator(5));
            Future<Long> future3 = executorService.submit(new FactorialCalculator(7));
            try {
                long nineFactorial = future1.get();
                long fiveFactorial = future2.get();
                long sevenFactorial = future3.get();
                System.out.println("Factorial of 9 :: " + nineFactorial);
                System.out.println("Factorial of 5 :: " + fiveFactorial);
                System.out.println("Factorial of 7 :: " + sevenFactorial);
            } catch (InterruptedException | ExecutionException e) {
                System.out.println("Exception occurred while computing factorial :: " + e.getMessage());
            }
            executorService.shutdown();
        }
    }

}

@SuppressWarnings("All")
class FactorialCalculator implements Callable<Long> {

    private final int number;

    FactorialCalculator(int number) {
        this.number = number;
    }

    @Override
    public Long call() {
        return calculateFactorial();
    }

    private Long calculateFactorial() {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }
        if (number == 0) {
            return 1L;
        }
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;

    }

    public int getNumber() {
        return number;
    }

}
