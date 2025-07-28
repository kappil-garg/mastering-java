package com.kapil.masteringjava.oop;

/**
 * Program to demonstrate Inheritance in Java.
 * Demonstrates how a subclass (Child) inherits fields and methods from its superclass (Parent).
 *
 * @author Kapil Garg
 */
public class InheritanceDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Inheritance Demo ***\n");

        Parent parent = new Parent();
        System.out.println("x = " + parent.x);
        parent.m1();

        Child child = new Child();
        System.out.println("y = " + child.y);
        child.m2();
        System.out.println("x = " + child.x);
        child.m1();

    }

}

class Parent {
	
    int x = 53;

	void m1() {
        System.out.println("Hello from Class :: Parent");
    }
	
}

class Child extends Parent {
    
	int y = 15;

	void m2() {
        System.out.println("Hello from Class :: Child");
    }
	
}
