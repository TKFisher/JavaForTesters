package com.javafortesters.chap012;

import domainentities.User;

/**
 * Chapter 12: page 186
 * Exercise: Create a ReadOnlyUser which has the permission ReadOnly, with the same default
 * username and password from User.
 */

public class ReadOnlyUser extends User {

    public ReadOnlyUser() {
    this("readonly", "password");
    }

    public ReadOnlyUser(String username, String password){
        super(username, password);
    }

    @Override
    public String getPermission(){
        return "ReadOnly";
    }


}
