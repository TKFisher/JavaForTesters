package com.UdemyAbsoluteIntroToOOP.Loops;

import org.junit.Test;

public class Loops_While_For_Ifs {


    @Test
    public void booleanEx_1() {
        boolean loop = 5 > 1;
        System.out.println(loop);
    }

    @Test
    public void booleanEx_2() {
        int loop = 10;
        System.out.println(loop);
    }

    /**
     * WHILE LOOPS
     *
     */

    @Test
    public void whileLoopSimple() {
        int value = 0;
        while (value < 10) {

            System.out.println("Hello" + " " + value);
            value = value + 1;      // notice what happens when you put this line before the sout.
        }
    }

    @Test
    public void whileLoop_1() {
        int loop = 0;
        while(loop < 10) {
            System.out.println(loop);
        }
    }

    @Test
    public void whileLoop_2() {
        int loop = 0;
        while(loop < 10) {
            loop++;         // notice what happens when you put this line after the sout.
            System.out.println(loop);

        }
    }

    @Test
    public void whileLoop_3() {
        int val = 0;
        //While the val is 'true' continue until equal to 10 and then break from loop.
        while(true) {
            System.out.println("Looping: " + " " + val);
            if(val == 3){
                break;
            }
            val++;
            System.out.println("Running: " + " " + val);
        }
    }


    @Test
    public void forLoopSimple_1() {

        for (; ; ) {
            System.out.println("Fuck it!");
        }
    }


    /**
     * FOR LOOPS
     *
     */
    @Test
    public void forLoopSimple_2() {
        for (int i = 0; i < 5; i = i + 1) {
            //System.out.println("Fuck it!" + " " + i);
            //OR:
            System.out.printf("Fuck it %d", i);
            //OR:
            //System.out.printf("Fuck it %d \n", i);
        }
    }

    @Test
    public void if_Example_1() {
        int myInt = 20;
        if (myInt > 30) {
            System.out.println("The first condition is met.");
        }
        else {
            System.out.println("The else condition is met.");
        }
    }

    @Test
    public void if_Example_2() {
        int myInt = 20;
        int myOtherInt = 40;

        if (myInt > 30) {
            System.out.println("The first condition is met.");
        }
        else if(myOtherInt  < 30){
            System.out.println("The else if condition is met.");
        }
        else
        {
            System.out.println("None of the above.");
        }
    }

    @Test
    public void webdriverTest (){

        String webelement_1 = "xxx";

    }



}
