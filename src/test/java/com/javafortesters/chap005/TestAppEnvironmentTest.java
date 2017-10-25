package com.javafortesters.chap005;

import domainobject.TestAppEnv;
import org.junit.Test;
import static domainobject.TestAppEnv.*;
import static org.junit.Assert.assertEquals;


public class TestAppEnvironmentTest {

    @Test
    public void getURLStatically() {
        assertEquals("Looking for the correct http.", "http://192.123.0.3:67", TestAppEnv.getURL());

    }

    @Test
    public void getURLDomainStatically() {
        assertEquals("message", "192.123.0.3", DOMAIN);
    }

    @Test
    public void getURLPortStatically() {
        assertEquals("message", "67", PORT);
    }
}
