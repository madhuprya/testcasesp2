package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeCheckerTest {

     PalindromeChecker palindromeChecker=new PalindromeChecker();
    @Test
    public void test1(){
        assertEquals(true,palindromeChecker.checkPelindrome(12321));
    }
    @Test
    public void test2(){
        assertEquals(true,palindromeChecker.checkPelindrome(1245678765421));
    }
    @Test
    public void test3(){
        assertEquals(false,palindromeChecker.checkPelindrome(1232112));
    }
    @Test
    public void test4(){
        assertEquals(false,palindromeChecker.checkPelindrome(123123));
    }
    @Test
    public void test5(){
        assertEquals(true,PalindromeChecker.checkPelindrome(0000000));
    }

}