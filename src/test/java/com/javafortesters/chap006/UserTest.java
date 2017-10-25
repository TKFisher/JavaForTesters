package com.javafortesters.chap006;


import domainentities.User;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/*
  We use the Select class constructor in the AL-EJP automation
  and call it like this example for the Sidebar test case:

         Select menuOption = new Select(languageSelector);
*/

public class UserTest {

    @Test
    public void canConstructNewUser() {

        // This line is key as it creates a new instance of (instantiates) the User Class
        // by using the "new" keyword and stores the variable "user".
        User user = new User();

    }

    @Test
    public void userHasDefaultUsernameAndPassword() {

        User user = new User();

        assertEquals("message", "default username", user.getUsername());
        assertEquals("message", "default password", user.getPassword());

        //Print out statements to the console.
        System.out.println("My username is: " + user.getUsername());
        System.out.println("My password is: " + user.getPassword());
    }

    @Test
    public void canConstructWithUsernameAndPwd() {

        User user = new User("admin", "123");
        assertEquals("the username is not correct.", "admin", user.getUsername());
        assertEquals("the password is not correct.", "123", user.getPassword());
    }

    @Test
    public void canSetPasswordAfterConstructed(){

        User user = new User();

        user.setPassword("newpassword");

        assertEquals("message", "newpassword", user.getPassword());

    }


    @Test
    public void newUserUsingSameConstructorParamNames () {

        User newUser = new User("bob", "hello");
        System.out.println(newUser.getPassword());
        System.out.println(newUser.getUsername());
    }

    @Test
    public void newUserUsingUniqueConstructorParamNames(){
        User newUser2 = new User("Kathy");
        System.out.println(newUser2.getUsername());

    }
}
