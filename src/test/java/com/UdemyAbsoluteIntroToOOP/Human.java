package com.UdemyAbsoluteIntroToOOP;
/**
 * It's all about the Objects. Objects do the work in the application.
 * Classes contain instructions/specification for how objects can be created and behave
 * in the application. We can use the class to create the objects that will do all of the work.
 */


/**
 * Class called 'Human' which will allow us to create objects of type equal to Human.
 * Contained in this class are behaviors and attributes.
 */
public class Human {

    String name;
    int age;
    int heightInInches;
    String eyeColor;

    /**
     * A constructor, which is a special method that gives us an actual way to create/construct Human
     * objects in our application. They always have the same name as the class.
     * You can leave the constructor empty like in the first example:
     */
   //Example 1 where variable are in another class:
    public Human(){
    }


    /**
     * Methods that define how Human will behave for speaking, eating, working etc.
     */
    public void speak() {
        System.out.println("Hello, my name is "+ name + ".");
        System.out.println("I am "+ heightInInches + " in inches.");
        System.out.println("I am "+ age + " years old." );
        System.out.println("My eye color is "+ eyeColor + ".");
    }

    public void eat(){
        System.out.println("eating...");
    }

    public void walk(){
        System.out.println("walking...");

    }

    public void work(){
        System.out.println("working...");

    }




}
