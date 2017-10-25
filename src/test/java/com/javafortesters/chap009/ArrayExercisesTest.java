package com.javafortesters.chap009;


import com.sun.jna.StringArray;
import domainentities.User;
import org.junit.Test;
import sun.net.www.content.text.Generic;

import java.awt.*;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class ArrayExercisesTest {

    @Test
    public void userObjectsArray() {

        User[] user = new User[3];

        user[0] = new User("Bob", "pwd-bob");
        user[1] = new User("Candy", "pwd-candy");
        user[2] = new User("Joe", "pwd-joe");

        assertEquals("Bob", user[0].getUsername());
        assertEquals("Candy", user[1].getUsername());
        assertEquals("Joe", user[2].getUsername());

        //For Each Loop
        for (User ausers : user) {
            System.out.println(ausers.getUsername() + " / " + ausers.getPassword());
            //System.out.println(ausers.getPassword());
        }

/*        for (int i = 0; i < user.length; i++) {
            System.out.println(user[0]);               //TODO:  This is not correct. Figure out how to make it correct.
        }*/

    }

    @Test
    public void oneHundredUserObjects() {

        User[] user = new User[100];

        //For Loop
        for (int userIndex = 0; userIndex < 100; userIndex++) {

            int userID = userIndex + 1;
            user[userIndex] = new User("user" + userID, "password" + userID);
            //System.out.println(userID);
        }

/*        //For Each Loop
        for (User auser : user) {
            System.out.println(auser.getUsername() + " / " + auser.getPassword());
        }*/

/*
        //Bonus points:  Tracy
        assertEquals("user1", user[0].getUsername());
        assertEquals("password2", user[0].getPassword());
*/

        //Bonus points:  Richard's way
        int userID = 1;
        for (User aUser : user) {
            assertEquals("user" + userID, aUser.getUsername());
            assertEquals("password" + userID, aUser.getPassword());
            userID++;   //you need this or the test will fail with the off by one error.
        }

        //Final assert....forcing an error to show Expected = 101.
        assertEquals(userID, 101);
    }

    @Test
    public void lengthTestArray() {

        String[] array_1 = {"one", "two", "three"};
        System.out.println(array_1.length);
        assertEquals(3, array_1.length);
    }

    @Test
    public void copyArray_1() {

        String[] workdays = {"monday", "tuesday", "wednesday", "thursday", "friday"};
        //confirms length
        System.out.println(workdays.length);

        //copies above array and extends index by two.
        String[] weekdays;
        weekdays = Arrays.copyOf(workdays, 7);
        System.out.println(Arrays.toString(weekdays));
        //confirms length
        System.out.println(weekdays.length);

        //shows that if the new index is not assigned a string value it will default to 'null'
        assertEquals("monday", weekdays[0]);
        assertEquals(null, weekdays[5]);

        //assigning a string value to index 6.
        weekdays[6] = "sunday";
        assertEquals("sunday", weekdays[6]);
        System.out.println(Arrays.toString(weekdays));
    }


}