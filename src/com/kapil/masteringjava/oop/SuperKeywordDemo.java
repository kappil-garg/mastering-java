package com.kapil.masteringjava.oop;

/**
 * Program to demonstrate 'super' keyword in Java.
 * Demonstrates how to access superclass variables and methods using the 'super' keyword.
 *
 * @author Kapil Garg
 */
public class SuperKeywordDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Super Keyword Demo ***\n");

        DemoSubClass obj1 = new DemoSubClass();
        System.out.println("SubClass Variable :: " + obj1.mySubVariable);
        System.out.println("SuperClass Variable (via super) :: " + obj1.getSuperVariable() + "\n");

        DemoSubClass obj2 = new DemoSubClass("TestSub");
        System.out.println("SuperClass Variable (directly) :: " + obj2.mySuperVariable + "\n");

        DemoSubClass obj3 = new DemoSubClass("TestSuper", 10);
        System.out.println("SubClass Variable :: " + obj3.mySubVariable);
        System.out.println("SuperClass Variable (via super) :: " + obj3.getSuperVariable());
        obj3.display();

    }

}

class DemoSuperClass {
	
    int mySuperVariable = 15;
    
	public DemoSuperClass () {
        System.out.println("In the default constructor :: DemoSuperClass");
    }
    
	public DemoSuperClass (String name) {
        System.out.println("In the parametrized constructor :: DemoSuperClass :: " + name);
    }

    void displaySuper() {
        System.out.println("\nMethod in SuperClass :: displaySuper()");
        System.out.println("Displaying Super Variable :: " + mySuperVariable);
    }

}

class DemoSubClass extends DemoSuperClass {
	
    int mySubVariable = 27;
    
	public DemoSubClass() {
        System.out.println("In the default constructor :: DemoSubClass\n");
    }
    
	public DemoSubClass(String name) {
        System.out.println("In the parametrized constructor :: DemoSubClass :: " + name + " \n");
    }
    
	public DemoSubClass(String name, int number) {
        super(name);
        System.out.println("In the parametrized constructor :: DemoSubClass :: " + number + " \n");
    }

    void display() {
        super.displaySuper();
        System.out.println("Method in SubClass :: display()");
    }

    int getSuperVariable() {
        return super.mySuperVariable;
    }

}
