package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTest{

        @Before
        public void setUp() throws Exception {
        }

        @After
        public void tearDown() throws Exception {
        }

        @Test
        public void isEvenOne() {
        assertEquals(true,EvenNum.isEven(2));
        }

        @Test
        public void isEvenTwo() {
                assertEquals(true,EvenNum.isEven(4));
        }

        @Test
        public void isEvenThree() {
                assertEquals(false,EvenNum.isEven(999));
        }
        @Test
        public void isEvenFour() {
                assertEquals(false ,EvenNum.isEven(221));
        }
        @Test
        public void isEvenFive() {
                assertEquals(true,EvenNum.isEven(100));
        }
        @Test
        public void isEvenSix() {
                assertEquals(false,EvenNum.isEven(51));
        }
}