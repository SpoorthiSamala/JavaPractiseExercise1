package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseOfStringTest {
    ReverseOfString rev;
    @Before
    public void setUp(){
        rev=new ReverseOfString();
    }
    @Test
    public void checkReverseOfAString()
    {
        String result=rev.RevString("Spoorthi");
        assertEquals("ihtroopS",result);
    }
    @Test
    public void checkReverseOfAStringReturnsString()
    {
        String result=rev.RevString("Ball");
        assertEquals("llaB",result);
    }
    @After
    public void tearDown(){
        rev=null;
    }

}