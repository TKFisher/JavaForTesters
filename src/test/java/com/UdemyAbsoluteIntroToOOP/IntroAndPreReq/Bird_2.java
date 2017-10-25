package com.UdemyAbsoluteIntroToOOP.IntroAndPreReq;


public class Bird_2 extends Animals_2 {

    public Bird_2(String name, String food, String color, int weight, String action) {
        super(name, food, color, weight, action);
    }

    @Override
    public void move() {
        System.out.println("From Bird_2:  Flapping wings.");
    }


}
