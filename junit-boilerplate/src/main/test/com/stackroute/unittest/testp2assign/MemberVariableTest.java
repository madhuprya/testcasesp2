package com.stackroute.unittest.testp2assign;

import com.stackroute.unittest.p2assign.MemberVariable;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberVariableTest {

    MemberVariable memberVariable=null;
    @Before
    public void setUp() throws Exception {
        memberVariable = new MemberVariable("Kalpesh",22,24000);
    }

    @Test
    public void test1()
    {
        boolean expected = true;
        boolean result = memberVariable.display();
        assertTrue(expected,result);
    }
    @Test
    public void test1()
    {
        memberVariable = new MemberVariable("Gharte",22,24300);
        boolean expected = false;
        boolean result = memberVariable.display();
        assertTrue(expected,result);
    }
}
