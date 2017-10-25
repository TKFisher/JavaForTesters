package com.UdemyAbsoluteIntroToOOP;

/**
 * Here is an example of two objects, 'tom' and 'joe' of type Human.
 */

public class Earth {

    //The entry point for all Java applications.
    public static void main(String args[]) {

        //A variable of type Human called 'tom'.  In this case 'tom' is and instance variable (or Object variable).
        //It points to the actual object, where the actual instance is created.
        Human tom;
        /**
         * Assign the variable 'tom' a value of the object called Human. The 'new' keyword is the thing
         * that is used to call the constructor method to create a new object of type Human.
         *
         * Note:  This needs to be set before other variables etc or you will see an error like:
         * Error:(21, 9) java: variable tom might not have been initialized.
         *
         * 'tom' in this case points to a location of where the Human object is created in memory,
         *  called an reference variable in this context.
         */
        tom = new Human();

        // Sets values for each variable.
        // Used with the empty constructor, Example 1, in the Human.
        tom.age = 5;
        tom.eyeColor = "brown";
        tom.heightInInches = 72;
        tom.name = "Tom Jones";


        //Invoking the speak method on the object.
        tom.speak();

        /**
         * Creating second new Human object called Joe.  This time we combined creating the variable "joe"
         * and assigning it to the object on the same line.
         */
        Human joe = new Human();

        //Sets values for variable called joe.
        joe.age = 36;
        joe.eyeColor = "green";
        joe.heightInInches = 68;
        joe.name = "Joe Schmoe";

        //Invoking the speak method on the object again but this time for Joe, a seperate object from tom.
        joe.speak();

    }
}
