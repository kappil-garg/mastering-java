package com.kapil.masteringjava.oop;

/**
 * Program to demonstrate Super Constructor Chaining in Java.
 * Demonstrates how constructors of parent classes are automatically called when a subclass object is created.
 *
 * @author Kapil Garg
 */
public class SuperConstructorChaining {

    public static void main(String[] args) {

        System.out.println("\n*** Super Constructor Chaining Demo ***");

        Developer developer = new Developer();
        System.out.println("Created :: Developer object");
        System.out.printf("x = %d || y = %d\n", developer.x, developer.y);

        Tester tester = new Tester();
        System.out.println("Created :: Tester object");
        System.out.printf("x = %d || z = %d\n", tester.x, tester.z);

    }

}

class Profession {

    int x = 3;

    Profession() {
        System.out.println("\nHello from Class :: Profession");
    }

}

class Developer extends Profession {

    int y = 15;

    Developer() {
        System.out.println("Hello from Class :: Developer");
    }

}

class Tester extends Profession {

    int z = 18;

}
