package com.UdemyAbsoluteIntroToOOP.Lesson_17_Challenge.User;


import com.UdemyAbsoluteIntroToOOP.Lesson_17_Challenge.Devices.Projector;
import com.UdemyAbsoluteIntroToOOP.Lesson_17_Challenge.Devices.TV;
import com.UdemyAbsoluteIntroToOOP.Lesson_17_Challenge.Remotes.RemoteControl;

public class Person {
    public Person() {
    }

    public static void main(String[] args) {

        Projector niceProjector = new Projector();

        TV niceLargeScreenTV = new TV();

        RemoteControl remoteControl = RemoteControl.getInstance();

        remoteControl.connectToDevice(niceProjector);
        remoteControl.clickOnButon();
        remoteControl.clickOffButon();

        remoteControl.connectToDevice(niceLargeScreenTV);
        remoteControl.clickOnButon();
        remoteControl.clickOffButon();
    }
}
