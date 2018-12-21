package com.stackroute.unittest.p1assign;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberIterationTest {
NumberIteration nm;
    @Before
    public void setUp() throws Exception {
        nm=new NumberIteration();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void numberIteration() {
            int[] num={1,2,2,3,3,3,4,4,4,4};
            int[] numrange;
            numrange=nm.numberIteration(4,num.length);
            for(int i=0;i<num.length;i++){
                assertEquals( num[i],numrange[i] );
            }
    }
}