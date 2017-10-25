package com.UdemyAbsoluteIntroToOOP.IntroAndPreReq;


// Note:  A  class can only extend one other class but it can extend as many interfaces as it needs.
// In this example the Sparrow class has extended the Bird class and the Flyable interface.
// We commented out the fly method and made a contract to use the Flyable interface instead.  Note:  We also commented
// The fly method in the Bird class so there would not be any conflicts.
public class Sparrow extends Bird implements Flyable{

    public Sparrow(String name, String food, String color, int weight, String action) {
        super(name, food, color, weight, action);

    }

/*
    //This is overriding the method "fly" defined in Bird and is being redefind in this class.
    // I've commented this out because I the Fly method in the Bird class is commented out.
    public void fly(){
        System.out.println("method from Sparrow using the Flyable interface: " + "I can fly high!");
    }
*/


    @Override
    public void fly() {
        System.out.println("The sparrow can fly now as a result of the Flyable interface.");
    }


}
