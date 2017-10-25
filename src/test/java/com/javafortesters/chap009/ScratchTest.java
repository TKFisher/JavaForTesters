package com.javafortesters.chap009;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ScratchTest {


    @Test
    public void scratch_1() {
        int[] values;
        values = new int[3];

        values[0] = 10;
        values[1] = 20;
        values[2] = 30;

     /*   System.out.println(values[0]);
        values[0] = 10;
        System.out.println(values[0]);
        System.out.println(values[1]);
        System.out.println(values[2]);*/

        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
//Another way to express the above is:
        int[] numbers = {5, 6, 7};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    @Test
    public void scratch_2() {

        String[] words = new String[3];

        words[0] = "Hello";
        words[1] = "How are ";
        words[2] = "you?";

        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);

//Another way to express the above is:
        String[] fruits = {"banana", "kiwi", "grapes"};

/*        System.out.println(fruits[0]);
        System.out.println(fruits[1]);
        System.out.println(fruits[2]);*/

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }

    @Test
    public void scratch_3() {

        String[] textItems = {"xxx", "ooo", "aaa"};

        for (String displayTextVariable : textItems) {
            System.out.println(displayTextVariable);
        }

        assertEquals("xxx", textItems[0]);
        assertEquals("ooo", textItems[1]);
        assertEquals("aaa", textItems[2]);
    }


    @Test
    public void scratch_4() {

        String[] workdays = {"monday", "tuesday", "wednesday", "thursday", "friday"};
        //System.out.println(workdays[3]);

        for (int i = 0; i < workdays.length; i++) {
            System.out.println(workdays[i]);
        }
    }

    @Test
    public void scratch_5() {

        String[] workdays = {"monday", "tuesday", "wednesday", "thursday", "friday"};
        //System.out.println(workdays[3]);

        for (String workVar : workdays) {
            System.out.println(workVar);
        }
    }

    @Test
    public void catArray() {
        String[] cats = {"black", "siamese", "tabby"};
        for (String catVar : cats) {
            System.out.println(catVar);
        }
        assertEquals("black", cats[0]);
        assertEquals("siamese", cats[1]);
        assertEquals("tabby", cats[2]);
    }

    @Test
    public void weekdayList() {

        List<String> weekdayVar = new ArrayList<String>();

        weekdayVar.add("monday");
        weekdayVar.add("tuesday");
        weekdayVar.add("wednesday");
        weekdayVar.add("thursday");
        weekdayVar.add("friday");

        System.out.println("DAYS OF WORK WEEK: ");
        for(String dayVar : weekdayVar){
            System.out.println(dayVar);
        }

        assertEquals("monday", weekdayVar.get(0));
        assertEquals("friday", weekdayVar.get(4));
    }
}
