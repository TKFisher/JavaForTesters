package com.UdemyAbsoluteIntroToOOP.Lesson_17_Challenge.Remotes;


import com.UdemyAbsoluteIntroToOOP.Lesson_17_Challenge.Devices.Device;

public class RemoteControl {
    private Device device = null;
    private static final RemoteControl INSTANCE = new RemoteControl();

    private RemoteControl() {
    }

    public static RemoteControl getInstance() {
        return INSTANCE;
    }

    public void connectToDevice(Device aDevice) {
        this.device = aDevice;
        System.out.println("---- connected to: " + this.device + "----");
    }

    public void clickOffButon() {
        this.device.turnOff();
    }

    public void clickOnButon() {
        this.device.turnOn();
    }
}

