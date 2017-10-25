package com.javafortesters.chap009;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class ArrayExamplesTest {

    @Test
    public void simpleArrayExample(){
        String[] numbers0123 = {"zero","one", "two", "three" };

        for(String numberText : numbers0123){

            System.out.println(numberText);
        }

        assertEquals("zero", numbers0123[0]);
        assertEquals("one", numbers0123[1]);
        assertEquals("two", numbers0123[2]);
        //forced error:
        assertEquals("message 4", "two", numbers0123[2]);
    }


    @Test
    public void splitString(){

        String [] textString = {"Showing results 1 through 15 of 15\n" +
                "for the search: Title begins with \"cat\""};

            for (String splitText : textString){
                System.out.println(splitText);
            }

    }


    @Test
    public void splitString_2() {

        String textString = "Showing results 1 through 15 of 15 for the search: Title begins with \"cat\"";

        String[] parts = textString.split(" ");

        for (String eachPart : parts) {
            System.out.println(eachPart);
        }

        assertEquals("Showing", parts[0]);

    }

}
