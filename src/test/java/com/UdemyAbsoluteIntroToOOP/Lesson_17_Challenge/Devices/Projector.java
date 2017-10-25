package com.UdemyAbsoluteIntroToOOP.Lesson_17_Challenge.Devices;




public class Projector implements Device {

    public Projector() {
    }

    public void turnOn() {
        this.pullDownProjectorScreen();
        System.out.println("Projector has been turned on");
    }

    public void turnOff() {
        this.pullUpProjectorScreen();
        System.out.println("Projector has been turned off");
    }


    // Projector methods:

    private void pullDownProjectorScreen() {
        System.out.println("Screen has been lowered for viewing");
    }

    private void pullUpProjectorScreen() {
        System.out.println("Screen raised back up to close");
    }

    public String toString() {
        return "Projector";
    }
}

