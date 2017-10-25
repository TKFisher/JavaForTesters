package com.UdemyAbsoluteIntroToOOP.IntroAndPreReq;

// This is a copy of the Animal class to show how to make it an abstract class by first adding an abstract
// method.  The move() method is an abstract method.
// You cannot create instances of an abstract class.  They are meant only to be inherited by other classes.
public abstract class Animals_2 {

    String name;
    String food;
    String color;
    int weight;
    String action;

    public Animals_2(String name, String food, String color, int weight, String action) {
        this.name = name;
        this.food = food;
        this.color = color;
        this.weight = weight;
        this.action = action;
    }

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


    // An abstract method. Note: An abstract method does not have a body.
    public abstract void move() ;
}
