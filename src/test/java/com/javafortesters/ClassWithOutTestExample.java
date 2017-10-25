package com.javafortesters;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

//This class does not have "Test" at the end of the class name and so will not be picked up if you run the
//test from the command line.
public class ClassWithOutTestExample {

    @Test
    public void classWOTest(){
        int answer = 2+2;
        assertEquals("2+2=4", 4, answer);

    }
}
