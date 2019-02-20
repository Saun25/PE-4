package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountCharTest {

    CountChar countChar;
    @Before
    public void setUp() throws Exception {
        countChar=new CountChar();
    }

    @After
    public void tearDown() throws Exception {
        countChar=null;
    }

    @Test
    public void countCharacterSuccess() {
        int expected=2;
        int actual=countChar.countCharacter('B',"BiswadeepBhattacharjee");
        assertEquals(expected,actual);
        assertNotNull(countChar);
    }
    @org.junit.Test
    public void countCharacterFailure() {
        int expected=4;
        int actual=countChar.countCharacter('B',"BiswadeepBhattacharjee");
        assertNotEquals(expected,actual);
        assertNotNull(countChar);
    }
}