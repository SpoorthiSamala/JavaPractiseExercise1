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
    }//creating an object
    @Test
    public void checkReverseOfAString()
    {
        String result=rev.revString("Spoorthi");
        assertEquals("ihtroopS",result);
    }
    @Test
    public void checkReverseOfAStringReturnsString()
    {
        String result=rev.revString("Ball");
        assertEquals("llaB",result);
    }
    @Test
    public void checkReverseOfAIntegerReturnsString()
    {
        String result=rev.revString("1234");
        assertEquals("4321",result);
    }

    @After
    public void tearDown(){
        rev=null;
    }

}