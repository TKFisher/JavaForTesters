package com.UdemyAbsoluteIntroToOOP.IntroAndPreReq;


public class Sparrow_2 extends Bird_2 implements Flyable{

    public Sparrow_2(String name, String food, String color, int weight, String action) {
        super(name, food, color, weight, action);

    }

    @Override
    public void fly() {
        System.out.println("The sparrow can fly now as a result of the Flyable interface.");
    }


}
