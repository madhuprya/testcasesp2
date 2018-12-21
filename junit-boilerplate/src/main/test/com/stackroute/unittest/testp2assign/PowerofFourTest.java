package com.stackroute.unittest.pe2;

import com.stackroute.unittest.pe2.PowerofFour;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerofFourTest {
    PowerofFour pof =new PowerofFour();



    @Test
    public void tearDown() throws Exception {

        assertEquals("this is power of 4",pof.checkPower(16));
        assertEquals("this is not power of 4",pof.checkPower(35));
        assertEquals("this is power of 4",pof.checkPower(256));
    }

}