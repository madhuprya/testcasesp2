package com.stackroute.unittest.p1assign;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RangeOddEvenTest {
    RangeOddEven oe ;
    @Before
    public void setUp() throws Exception {
        oe=new RangeOddEven();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void oddeven() {

        assertEquals("Tom",oe.oddeven(28));
    }

    @Test
    public void oddeven1() {

        assertEquals("Jerry",oe.oddeven(29));
    }
}