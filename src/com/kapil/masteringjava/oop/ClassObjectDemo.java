package com.kapil.masteringjava.oop;

/**
 * Program to demonstrate Class & Object in Java.
 * Demonstrates how to create and use objects, as well as using private fields with public methods for encapsulation.
 *
 * @author Kapil Garg
 */
public class ClassObjectDemo {

    public static void main(String[] args) {
        System.out.println("\n*** Class Object Demo ***\n");
        Teacher teacher = new Teacher();
        teacher.setName("Ted Mosby");
        teacher.setSubjectName("Architecture");
        System.out.println("Teacher Name :: " + teacher.getName());
        System.out.println("Subject Name :: " + teacher.getSubjectName());
    }

}

class Teacher {

    private String name;
    private String subjectName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

}
