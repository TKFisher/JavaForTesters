package com.UdemyAbsoluteIntroToOOP.Lesson_17_Challenge.Devices;


// Remember a class can extend only one other class but it can implement as many interfaces as needed.

public class SurroundSoundSystem implements Device {

    public SurroundSoundSystem() {
    }

    public void turnOn() {
        this.switchToFavoriteCD();
        this.increaseVolume();
        System.out.println("Sound system has been turned on");
    }

    // We had to implement the abstract method from the Device Interface here. And then add the methods to it from
    // this class within the body of the method.  Note: "@Override" is not necessary here.
    @Override
    public void turnOff() {
        this.lowerVolume();
        System.out.println("Surround sound system has been turned off");
    }

    // Surround Sound methods:
    private void increaseVolume() {
        System.out.println("Volume has increased to a comfortable level on startup");
    }

    private void switchToFavoriteCD() {
        System.out.println("Michael Bolton now playing");
    }

    private void lowerVolume() {
        System.out.println("Lowering surround sound volume before closeing system");
    }

    public String toString() {
        return "Sound System";
    }
}