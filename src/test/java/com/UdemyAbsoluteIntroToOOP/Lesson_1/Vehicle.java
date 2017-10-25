package com.UdemyAbsoluteIntroToOOP.Lesson_1;


/**
 * When a Vehicle object is sent a message it carries out the behavior defined in the method.
 *
 * The methods are the messages that are sent to the Vehicle object.
 * The 'sout's are the behaviors carried out by the method of the object.
 */

public class Vehicle {


    public void startEngine(){
        System.out.println("Starting my engine.");
    }
    public void stopEngine(){
        System.out.println("Stopping my engine");
    }
    public void accelerate(){
        System.out.println("Accelerating my engine.");
    }


}
