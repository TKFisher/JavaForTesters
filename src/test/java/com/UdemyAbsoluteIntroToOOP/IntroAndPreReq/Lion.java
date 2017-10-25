package com.UdemyAbsoluteIntroToOOP.IntroAndPreReq;


public class Lion extends Animals{

    public Lion(String name, String food, String color, int weight, String action) {
        super(name, food, color, weight, action);
    }

    //Animals animals = new Animals("","",0,"","");

    public void roar(){
        System.out.println("I rule the animal world.");
    }
}
