package com.kapil.masteringjava.oop;

/**
 * Program to demonstrate Anonymous Class in Java.
 * Demonstrates how to create an anonymous class that extends a class and implements an interface.
 *
 * @author Kapil Garg
 */
@SuppressWarnings("All")
public class AnonymousClassDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Anonymous Class Demo ***\n");

        Notification emailNotification = new Notification() {
            @Override
            void sendNotification() {
                System.out.println("Sending Email Notification :: sendNotification()");
            }
        };
        emailNotification.showHeader();
        emailNotification.sendNotification();

        Notifier smsNotifier = new Notifier() {
            @Override
            public void notifyUser() {
                System.out.println("Sending SMS Notification :: notifyUser()");
            }
        };
        smsNotifier.notifyUser();

    }

}

interface Notifier {

    void notifyUser();

}

class Notification {

    void showHeader() {
        System.out.println("Hello from Notification Class :: showHeader()");
    }

    void sendNotification() {
        System.out.println("Hello from Notification Class :: sendNotification()");
    }

}
