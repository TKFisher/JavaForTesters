package com.javafortesters.Scratch;


import domainentities.User;
import org.junit.Test;

public class Scratch_1 {


 @Test
    public void changePassword(){

     User user = new User();
     System.out.println(user.password);

     user.setPassword("Hello");
  System.out.println(user.getPassword());

 }

}
