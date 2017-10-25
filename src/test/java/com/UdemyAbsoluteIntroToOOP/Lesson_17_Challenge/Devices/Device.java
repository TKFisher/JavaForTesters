package com.UdemyAbsoluteIntroToOOP.Lesson_17_Challenge.Devices;

/**
 * We are using an Interface instead of an Abstract class (like we did in the example) to show you that we can use either way.
 */

public interface Device {

    // the methods of an Interface does not have bodies ( {} ).
    // these methods are called abstract methods.
    void turnOn();
    void turnOff();
}
