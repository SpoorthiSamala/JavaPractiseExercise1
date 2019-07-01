package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CapitalorNotTest {
    CapitalorNot capitalorNot;
    @Before
    public void setUp(){
        capitalorNot=new CapitalorNot();

    }
    @Test
    public void checkingCapitalLetter()
    {
        String result=capitalorNot.CharacterChecking('A');
        assertEquals("Capital Letter",result);
    }
    @Test
    public void checkingSmallcase()
    {
        String result=capitalorNot.CharacterChecking('a');
        assertEquals("Smallcase Letter",result);
    }
    @Test
    public void checkingDigit()
    {
        String result=capitalorNot.CharacterChecking('1');
        assertEquals("Digit",result);
    }
    @After
    public void tearDown()
    {
        capitalorNot=null;
    }


}