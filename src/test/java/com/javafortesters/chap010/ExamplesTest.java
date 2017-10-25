package com.javafortesters.chap010;


import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ExamplesTest {


    @Test
    public void demo_1 (){

        String[] someDays = {"Tuesday","Thursday",
                "Wednesday","Monday",
                "Saturday","Sunday",
                "Friday"};

        List<String> days = Arrays.asList(someDays);


    }


}
