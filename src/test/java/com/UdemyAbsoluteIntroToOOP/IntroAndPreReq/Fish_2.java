package com.UdemyAbsoluteIntroToOOP.IntroAndPreReq;


public class Fish_2 extends Animals_2{

    public Fish_2(String name, String food, String color, int weight, String action) {
        super(name, food, color, weight, action);
    }

    public void swim(){
        System.out.println("I can swim.");
    }

    //We added the move method from the abstract Animals_2 class.
    @Override
    public void move() {
        System.out.println("From Fish_2: Shwoosh, shwoosh!");

    }
}
