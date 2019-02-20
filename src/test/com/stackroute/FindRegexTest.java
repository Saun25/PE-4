package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindRegexTest {

    FindRegex findRegex;
    @Before
    public void setUp() throws Exception {
        findRegex=new FindRegex();
    }

    @After
    public void tearDown() throws Exception {
        findRegex=null;
    }

    @Test
    public void findName() {
        assertEquals("Is Harry here?True",findRegex.findName("This is Harry"));
        assertNotNull(findRegex.findName("This is Harry"));
    }
}