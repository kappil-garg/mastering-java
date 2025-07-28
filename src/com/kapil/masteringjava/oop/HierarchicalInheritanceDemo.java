package com.kapil.masteringjava.oop;

/**
 * Program to demonstrate Hierarchical Inheritance in Java.
 * Demonstrates how multiple subclasses (Circle, Rectangle) inherit from a common superclass (Shape).
 *
 * @author Kapil Garg
 */
public class HierarchicalInheritanceDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Hierarchical Inheritance Demo ***\n");

        System.out.println("*** Creating Circle Object ***\n");
        Circle circle = new Circle();
        circle.drawCircle();
        circle.drawShape();

        System.out.println("\n*** Creating Rectangle Object ***\n");
        Rectangle rectangle = new Rectangle();
        rectangle.drawRectangle();
        rectangle.drawShape();

    }

}

class Shape {

    protected void drawShape() {
        System.out.println("Drawing a generic shape.");
    }

}

class Circle extends Shape {

    protected void drawCircle() {
        System.out.println("Drawing a circle.");
    }

}

class Rectangle extends Shape {

    protected void drawRectangle() {
        System.out.println("Drawing a rectangle.");
    }

}
