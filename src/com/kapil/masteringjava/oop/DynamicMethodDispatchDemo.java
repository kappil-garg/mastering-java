package com.kapil.masteringjava.oop;

/**
 * Program to demonstrate Dynamic Method Dispatch in Java.
 * Demonstrates dynamic method dispatch using method overriding.
 *
 * @author Kapil Garg
 */
public class DynamicMethodDispatchDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Dynamic Method Dispatch Demo ***\n");

        Insurance insurance = new TermInsurance();
        System.out.println(insurance.policyName());

        insurance = new HealthInsurance();
        System.out.println(insurance.policyName());

    }

}

class Insurance {

    String policyName() {
        return "Hello from policyName() :: Insurance Class";
    }

}

class TermInsurance extends Insurance {

    @Override
    String policyName() {
        return "Hello from policyName() :: iProtect Smart Plus";
    }

}

class HealthInsurance extends Insurance {

    @Override
    String policyName() {
        return "Hello from policyName() :: ReAssure Elite";
    }

}
