package com.kapil.masteringjava.strings;

/**
 * Program to demonstrate the usage of toString() method in Java.
 * Demonstrates how to override toString() method in a class to provide a custom string representation of an object.
 *
 * @author Kapil Garg
 */
public class ToStringMethodDemo {

    public static void main(String[] args) {

        System.out.println("\n*** toString() Demo ***\n");

        StudentToStringDemo firstStudent = new StudentToStringDemo("Ted Mosby", "Architecture", 67);
        firstStudent.setCurrentYear(3);
        System.out.println(firstStudent);

        StudentToStringDemo secondStudent = new StudentToStringDemo("Tracy McConnell", "Economics", 76);
        secondStudent.setCurrentYear(2);
        System.out.println(secondStudent);

    }

}

class StudentToStringDemo {

    private final String studentName;
    private final String subjectName;

    private final int studentRollNumber;

    private int currentYear;

    StudentToStringDemo(String studentName, String subjectName, int studentRollNumber) {
        this.studentName = studentName;
        this.subjectName = subjectName;
        this.studentRollNumber = studentRollNumber;
        this.currentYear = 1;
    }

    @Override
    public String toString() {
        return "Roll No. :: " + studentRollNumber + " || Student Name :: " + studentName
                + " || Subject Name :: " + subjectName + " || Current Year :: " + currentYear;
    }

    public void setCurrentYear(int currentYear) {
        this.currentYear = currentYear;
    }

}
