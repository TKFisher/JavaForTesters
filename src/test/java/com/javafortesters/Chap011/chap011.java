package com.javafortesters.Chap011;


import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class chap011 {

    @Test
    public void throwANullPointerException() {
        Integer age = 18;                     //change to a value of null to see the null pointer exception error.
        String ageAsString = age.toString();
        String yourAge =
                "You are " + ageAsString + " years old";
        assertEquals("You are 18 years old", yourAge);
    }


    @Test
    public void catchANullPointerException() {
        Integer age = 18;
        String ageAsString;
        try {

            ageAsString = age.toString();
            // try replacing NullPointerException below with ArithmeticException and see what happens.
        } catch (NullPointerException e) {
            age = 18;
            ageAsString = age.toString();
        } catch (ArithmeticException e) {
            // to trigger this:  add "age = 18 / 0;" to Try statement above "ageAsString = age.toString();".
            age = 18;
            ageAsString = age.toString();
        }
        String yourAge =
                "You are " + age.toString() + " years old";
        assertEquals("You are 18 years old", yourAge);
    }

    // on my own use ArithmeticException and force the exception to be thrown.
    @Test
    public void catchArithmeticException() {
        Integer x = 10;
        Integer y = 0;
        Integer output;
        try {
            output = x / y;
        } catch (ArithmeticException e) {
            System.out.println("This is an Arithmetic Exception.  You can't divide an integer by zero.  ");
        }
    }


/*    @Test
    public void thisTriggersASyntaxErrorBecauseExceptionIsNotDeclared() {
        Integer age = null;
        String ageAsString;
        try {
            ageAsString = age.toString();
        } catch (NoSuchMethodException e) {
            age = 18;
            ageAsString = age.toString();
            System.out.println("Get Message - " + e.getMessage());
        }
        String yourAge =
                "You are " + age.toString() + " years old";
        assertEquals("You are 18 years old", yourAge);
    }

    */


    @Ignore
    @Test(expected = IllegalArgumentException.class)  // you need one of the conditions to fail with this added.
    public void catchADifferentException() {
        Integer age = null;
        Integer x = 8;          //added x and y to trigger the arithmetic error.
        Integer y = 0;
        String ageAsString;
        String yourAge = "";

        try {
            ageAsString = age.toString();

        } catch (NullPointerException e) {
            age = (x / y);                           //play around with updating this.
            ageAsString = age.toString();
        } catch (IllegalArgumentException e) {
            e.getStackTrace();
        } catch (ArithmeticException e) {
            age = 18;
            ageAsString = age.toString();
            e.getStackTrace();
        } finally {
            System.out.println("This will still get executed because of the 'finally'");
        }
        yourAge = "You are " + age.toString() + " years old";
        assertEquals("You are 18 years old", yourAge);
    }


    @Test(expected = NullPointerException.class)
    public void nullPointerExceptionExpected() {
        Integer age = null;
        age.toString();
    }


    @Test
    public void tryCatchFinallyANullPointerException() {
        Integer age = null;
        String ageAsString;
        String yourAge = "";

        try {
            ageAsString = age.toString();
        } catch (NullPointerException e) {
            age = 18;
            ageAsString = age.toString();
        } finally {
            yourAge = "You are " + age.toString() + " years old";
        }
        assertEquals("You are 18 years old", yourAge);
    }


    @Ignore
    @Test
    //(expected = IllegalArgumentException.class) // delete "(expected = IllegalArgumentException.class)" and see what happens.
    public void exampleTryCatchFinally() {
        Integer age = null;

        try {
            System.out.println("1. generate a null pointer exception");
            System.out.println(age.toString());

        } catch (NullPointerException e) {
            System.out.println("2. handle null pointer exception");

            throw new IllegalArgumentException
                    ("Null pointer became Illegal", e);
        } finally {
            System.out.println("3. run code in finally section");    // This statement prints because of the 'finally'
            //try deleting the finally and brackets and you will see that the statement does not print.
        }
    }


}
