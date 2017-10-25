package com.UdemyAbsoluteIntroToOOP.Lesson_17_Challenge.Devices;


public class TV implements Device {
    public TV() {
    }


    public void turnOn() {
        this.SwitchToFavoriteChannel();
        System.out.println("TV has been turned on");
    }

    public void turnOff() {
        this.turnOnTVAlarm();
        System.out.println("TV has been turned off");
    }

    private void SwitchToFavoriteChannel() {
        System.out.println("Switched to your favorite Channel");
    }

    private void turnOnTVAlarm() {
        System.out.println("TV Alarm set for you to wake up in the morning");
    }

    public String toString() {
        return "Television";
    }
}
