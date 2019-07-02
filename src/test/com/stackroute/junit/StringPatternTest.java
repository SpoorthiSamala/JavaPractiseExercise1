package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringPatternTest {
    StringPattern stringPattern;
    @Before
    public void setUp(){
        stringPattern=new StringPattern();
    }
    @Test
    public void givenOneStringAndOneIntegerReturnsStringPattern(){
        String result=stringPattern.repeatPattern("Stack",3);
        assertEquals("Stackackackack",result);
    }
    @Test
    public void givenOneStringAndOneIntegerReturnString(){
        String result=stringPattern.repeatPattern("Route",2);
        assertEquals("Routetete",result);
    }
    @After
    public void tearDown(){
        stringPattern=null;
    }

}