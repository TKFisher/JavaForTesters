package com.UdemyAbsoluteIntroToOOP.IntroAndPreReq;


public class Chicken extends Bird{


    public Chicken(String name, String food, String color, int weight, String action) {
        super(name, food, color, weight, action);
    }

/*   //This is overriding the method "fly" defined in Bird and is being redefind in this class.
    public void fly(){
        System.out.println("method from Chicken class: " + "I cannot fly.");
    }*/
}
