package com.kapil.masteringjava.oop;

/**
 * Program to understand multiple inheritance in Java using interfaces.
 * Demonstrates how a class can implement multiple interfaces to achieve multiple inheritance.
 *
 * @author Kapil Garg
 */
public class MultipleInheritanceDemo {

    public static void main(String[] args) {

        System.out.println("\n*** Multiple Inheritance Demo ***\n");

        Camera camera = new Smartphone();
        camera.takePhoto();
        camera.getDeviceType();

        MusicPlayer musicPlayer = new Smartphone();
        musicPlayer.playMusic();
        musicPlayer.getDeviceType();

    }

}

interface Camera {

    void takePhoto();

    void getDeviceType();

}

interface MusicPlayer {

    void playMusic();

    void getDeviceType();

}

class Smartphone implements Camera, MusicPlayer {

    @Override
    public void takePhoto() {
        System.out.println("Smartphone is capturing a photo.");
    }

    @Override
    public void playMusic() {
        System.out.println("Smartphone is playing music.");
    }

    @Override
    public void getDeviceType() {
        System.out.println("Smartphone: A device that works as both a Camera and a Music Player!");
    }

}
