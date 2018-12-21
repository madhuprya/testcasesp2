package com.stackroute.unittest.test;

import com.stackroute.unittest.pe1.EvenNumberCheck;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumberCheckTest {
    EvenNumberCheck enc;
    @Before
    public void setUp() throws Exception {
        enc = new EvenNumberCheck();

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void even() {
        assertEquals(true,enc.even(22));
    }
}