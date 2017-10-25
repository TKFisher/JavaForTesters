package com.javafortesters.chap004;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerExampleTest {

    @Test
    public  void integerExploration() {

    Integer four = new Integer(4);

        assertEquals("value should be 4.", 4, four.intValue());

    }

    @Test
    public void integerString(){

        Integer stringValueOfFive = new Integer("5");
        assertEquals("the string should be '5'", 5 , stringValueOfFive.intValue());
    }
}
