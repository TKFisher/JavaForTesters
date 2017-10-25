package com.javafortesters.chap012;

import domainentities.User;

/**
 * Chapter 12: page 185
 * Created new class for an Admin User with is extend to use the User Class.
 */


public class AdminUser extends User {

    // the constructors for my AdminUser class
    public AdminUser() {
        this("adminuser", "password");
    }

    //Note that I call the super constructor, which calls the constructor on User (the superclass)
    public AdminUser(String username, String password) {
        super(username, password);
    }

    //The override tells the compiler to check that the getPermission method is really on the User object and is still the same declaration.
    @Override
    public String getPermission() {
        return "Elevated";
    }


}
