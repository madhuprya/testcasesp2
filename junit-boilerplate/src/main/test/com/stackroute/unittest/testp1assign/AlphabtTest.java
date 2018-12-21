package com.stackroute.unittest.testp1assign;
import com.stackroute.unittest.p1assign.Alphabt;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlphabtTest {
    Alphabt a;
    @Before
    public void setUp() throws Exception {
        a=new Alphabt();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void alphabetType1() {
        assertEquals("Vowel",a.alphabetType("U"));
    }
    @Test
    public void alphabetType2() {
        assertEquals("invalid String",a.alphabetType("Madhu2"));
    }
    @Test
    public void alphabetType3() {
        assertEquals("ConsonantVowelConsonantConsonantVowel",a.alphabetType("Madhu"));
    }
    @Test
    public void alphabetType4() {
        assertEquals("VowelVowel",a.alphabetType("ui"));
    }
    @Test
    public void alphabetType5() {
        assertEquals("VowelVowelConsonant",a.alphabetType("uib"));
    }


}