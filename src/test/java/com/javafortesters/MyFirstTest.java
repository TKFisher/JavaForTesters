package com.javafortesters;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MyFirstTest {

    @Test
    public void canAddTwoPlusTwo() {
        int answer = 2 + 2;
        assertEquals("message here", 4, answer);
    }

    @Test
    public void canSubtractTwoFromTwo() {
        int answer = 2 - 2;
        assertEquals("message", 0, answer);
    }

    @Test
    public void canDivideFourByTwo(){
        int answer = 4/2;
        assertEquals("message", 2, answer);
    }

    @Test
    public void canMultiplyTwoByTwo(){
        int answer = 2*2;
        assertEquals("message", 4, answer);
    }

}

