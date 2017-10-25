package com.UdemyAbsoluteIntroToOOP.IntroAndPreReq;


public class Fish extends Animals{

    public Fish(String name, String food, String color, int weight, String action, String type) {
        super(name, food, color, weight, action);
    }

    public void swim(){
        System.out.println("I can swim.");
    }

}
