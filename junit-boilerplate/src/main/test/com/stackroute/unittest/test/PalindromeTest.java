package com.stackroute.unittest.test;

import com.stackroute.unittest.p1assign.Palindrome;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome p;

    @Before
    public void setUp() throws Exception {
        p=new Palindrome();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void palindromeCheck1() {
        assertEquals(8888+" is a palindrome and the sum of even numbers is greater than 25",p.palindromeCheck(8888));
    }
    @Test
    public void palindromeCheck2() {
        assertEquals(1881+" is a palindrome and the sum of even numbers is less than 25",p.palindromeCheck(1881));
    }
    @Test
    public void palindromeCheck3() {
        assertEquals(1234+" is not a palindrome",p.palindromeCheck(1234));
    }

}