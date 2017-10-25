package com.javafortesters.chap012;

import domainentities.User;       // added when I extended my EnvironmentUser object.
import domainobject.TestAppEnv;   // added when I set return type = TestAppEnv object.

/**
 * Created this object as part of Java For Testers. Chapter 12, ex 1.
 * The other chapter options were to update the User.java object and TestAppEnv.java.
 */

public class EnvironmentUser extends User {


    private String url = "http://www.mytesturl.com";


    public String getUrl() {
        return TestAppEnv.getURL();
    }




}
