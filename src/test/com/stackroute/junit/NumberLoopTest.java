package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberLoopTest {
    NumberLoop numberLoop;
    @Before
    public void setUp(){
        numberLoop=new NumberLoop();
    }
    @Test
    public void givenOneIntegerReturnsANumberPattern()
    {
        String result=numberLoop.repeatativeNumber(3);
        assertEquals("122333",result);
    }
    @Test
    public void givenOneIntegerReturnsAPattern()
    {
        String result=numberLoop.repeatativeNumber(5);
        assertEquals("122333444455555",result);
    }
    @Test
    public void givenOneIntegerReturnAPattern()
    {
        String result=numberLoop.repeatativeNumber(0);
        assertNotEquals("0",result);
    }
    @After
    public void tearDown(){
        numberLoop=null;
    }

}