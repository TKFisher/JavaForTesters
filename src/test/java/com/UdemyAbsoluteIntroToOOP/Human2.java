package com.UdemyAbsoluteIntroToOOP;


/**
 * Example 2:
 * We can assign values to the a Human object inside of the constructor of the class
 * so that we don't have to set these Fields later after the object is already created.
 */

public class Human2 {

    String name;
    int age;
    int heightInInches;
    String eyeColor;

/*    // Hard coded values.
    public Human2(){
        age = 36;
        eyeColor = "green";
        heightInInches = 65;
        name = "Joe Smith";
    }*/

    //Super Constructor:  Instead of using hard coded values above you can create a more dynamic way of setting variables.
    public Human2(String name, int age, int heightInInches, String eyeColor) {
        super();
        this.name = name;
        this.age = age;
        this.heightInInches = heightInInches;
        this.eyeColor = eyeColor;
    }

    /**
     * Methods that define how Human2 will behave.
     */
    public void speak() {
        System.out.println("Hello, my name is " + name + ".");
        System.out.println("I am " + heightInInches + " in inches.");
        System.out.println("I am " + age + " years old.");
        System.out.println("My eye color is " + eyeColor + ".");
    }

    public void eat() {
        System.out.println("eating...");
    }

    public void walk() {
        System.out.println("walking...");

    }

    public void work() {
        System.out.println("working...");

    }


}
