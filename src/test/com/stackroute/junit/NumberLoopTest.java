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
    public void givenOneIntegerReturnsAPattern()
    {
        String result=numberLoop.Repeatative(3);
        assertEquals("122333",result);
    }
    @Test
    public void givenOneIntegerReturnsAPatterns()
    {
        String result=numberLoop.Repeatative(5);
        assertEquals("122333444455555",result);
    }
    @After
    public void tearDown(){
        numberLoop=null;
    }

}