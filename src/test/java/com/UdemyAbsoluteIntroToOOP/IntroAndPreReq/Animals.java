package com.UdemyAbsoluteIntroToOOP.IntroAndPreReq;

// The specification (blue print) of the Animal class.
// The Animal is the supper class (or, main, or parent class) of the sub-classes)
public class Animals {

    String name;
    String food;
    String color;
    int weight;
    String action;

    // Instructions for how the animal will be created.
    public Animals(String name, String food, String color, int weight, String action) {
        this.name = name;
        this.food = food;
        this.color = color;
        this.weight = weight;
        this.action = action;
    }


    //List of defined behaviors:
    public void name() {
        System.out.println("\n" + "I'm a " + name + ".");
    }

    public void eat() {
        System.out.println("I like " + food + "!");
    }

    public void visual() {
        System.out.println("My color is " + color + ".");
    }

    public void size() {
        System.out.println("I weigh " + weight + " pounds.");
    }

    public void action() {
        System.out.println("I can " + action + ".");
    }

}
