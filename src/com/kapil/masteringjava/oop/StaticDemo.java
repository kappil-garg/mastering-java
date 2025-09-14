package com.kapil.masteringjava.oop;

/**
 * Program to demonstrate 'static' keyword in Java.
 * Demonstrates the use of static fields (shared across all instances) and static blocks (for initialization).
 *
 * @author Kapil Garg
 */
public class StaticDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Static Keyword Demo ***\n");

        Employee employee1 = new Employee();
        employee1.setName("Barney Stinson");
        employee1.setEmployeeId("150402");
        System.out.println(employee1.getName() + " (" + employee1.getEmployeeId() + ") || " + Employee.companyName);

        Employee employee2 = new Employee();
        employee2.setName("Marshall Eriksen");
        employee2.setEmployeeId("280601");
        System.out.println(employee2.getName() + " (" + employee2.getEmployeeId() + ") || " + Employee.companyName);

    }

}

class Employee {

    static String companyName;

    static {
        companyName = "Goliath National Bank";
    }

    private String name;
    private String employeeId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

}
