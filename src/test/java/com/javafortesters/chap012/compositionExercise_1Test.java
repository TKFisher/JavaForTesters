package com.javafortesters.chap012;


import domainentities.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class compositionExercise_1Test {


    /**
     * will need to uncomment code in the User.java class to demonstrate Chapter 12, Ex 1,
     * first example. (page 366/367) "Create a TestAppEnv object within my User object"
     */
   /* @Test
     public void userGetURL(){
        User user = new User();
        user.getUrl();
    }*/

    // Chapter 12, Ex 1, third example (page 367/368) "Create a new EnvironmentUser"
    @Test
    public void usingEnvUserObject() {
        EnvironmentUser env = new EnvironmentUser();

        assertEquals("default username", env.getUsername());     // inherits from the User object.
        //assertEquals("url", env.getUrl());                     // coming from the EnvironmentUser object which inherits from the TestAppEnv object.
        assertEquals("http://192.123.0.3:67", env.getUrl());
    }

    /**
     * Example where I access the getPermission method from the User class and assert value assigned to that object.
     */

    @Test
    public void checkUserPermisson() {
        User aUser = new User();
        assertEquals("Normal", aUser.getPermission());  //added my own method, getPermissio, to User Class
    }

    /**
     * Demonstrates how you access the username, password, permission level from the Admin class.
     * Because the Admin class is extended to the User class I can use the getUsername and getPassword methods to
     * verify the default values for adminuser and password within the Admin class.
     */
    @Test
    public void anAdminUserHasDefaultValues() {
        AdminUser anAdmin = new AdminUser();
        assertEquals("adminuser", anAdmin.getUsername());  //using the User class accessor method.
        assertEquals("password", anAdmin.getPassword());   //using the User class accessor method.
        assertEquals("Elevated", anAdmin.getPermission()); //using the Admin class regular method.
    }

    /**
     * Same as above but this time we can set new values for username and password using the User class getter methods.
     */

    @Test
    public void anAdminUserHasCustomValues() {
        AdminUser anAdmin = new AdminUser("aDm1n", "PazzW0rd"); //setting new values for username and password
        assertEquals("aDm1n", anAdmin.getUsername());           //using the User class to get and verify the new username.
        assertEquals("PazzW0rd", anAdmin.getPassword());        //using the User class to get and verify the new password.
        assertEquals("Elevated", anAdmin.getPermission());      //using the Admin class regular method.
    }


    @Test
    public void aReadOnlyUserWithDefaultValues() {
        ReadOnlyUser aReadOnly = new ReadOnlyUser();
        assertEquals("ReadOnly", aReadOnly.getPermission());
        assertEquals("readonly", aReadOnly.getUsername());
        assertEquals("password", aReadOnly.getPassword());
    }


}
