package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceStringTest {

    ReplaceString replaceString;
    @Before
    public void setUp() throws Exception {
        replaceString = new ReplaceString();
    }

    @After
    public void tearDown() throws Exception {
        replaceString = null;
    }

    @Test
    public void replaceSuccess() {
        assertEquals("faity fry",replaceString.replace("daily dry"));
        assertNotNull(replaceString.replace("daily dry"));
    }

    @Test
    public void replaceFailure() {
        assertNotEquals("gaity gry",replaceString.replace("daily dry"));
        assertNotNull(replaceString.replace("daily dry"));
    }
}