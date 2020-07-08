package com.tcs;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.*;

public class FirstTest
{

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testAppConstructor() {
        try {
            new First();
        } catch (Exception e) {
            fail("Construction failed.");
        }
    }

    @Test
    public void testFirstMain()
    {
        First.main(null);
        try {
            assertEquals("Welcome to TCS iON RIO Projects" + System.getProperty("line.separator"), outContent.toString());
        } catch (AssertionError e) {
            fail("\"message\" is not \"Welcome to TCS iON RIO Projects\"");
        }
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

}
