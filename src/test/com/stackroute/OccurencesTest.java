package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OccurencesTest {

    Occurences occurences;
    @Before
    public void setUp() throws Exception {
        occurences=new Occurences();
    }

    @After
    public void tearDown() throws Exception {
        occurences=null;
    }

    @Test
    public void wordOccurence() {
        assertArrayEquals(new String[]{"found: 4 - 6","found: 10 - 12","found: 27 - 29"},occurences.wordOccurence("She sells seashells by the seashore"));
    }
}