package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SortWordsTest {

    SortWords sortWords;
    @Before
    public void setUp() throws Exception {
        sortWords= new SortWords();
    }

    @After
    public void tearDown() throws Exception {
        sortWords=null;
    }

    @Test
    public void sortSuccess1() {
        List<String> expected= new ArrayList<>();
        expected.add("biswadeep");
        expected.add("saunak");
        assertEquals(expected,sortWords.sort("saunak biswadeep"));
        assertNotNull(sortWords.sort("saunak biswadeep"));
    }

    @Test
    public void sortSuccess2() {
        List<String> expected= new ArrayList<>();
        expected.add("anurag");
        expected.add("anuvab");
        assertEquals(expected,sortWords.sort("anuvab anurag"));
        assertNotNull(sortWords.sort("anuvab anurag"));
    }

    @Test
    public void sortFailure() {
        List<String> expected= new ArrayList<>();
        expected.add("anurag");
        expected.add("anusha");
        assertNotEquals(expected,sortWords.sort("anuvab anurag"));
        assertNotNull(sortWords.sort("anuvab anurag"));
    }
}