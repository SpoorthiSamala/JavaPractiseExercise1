package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddingNumbersTest {
    AddingNumbers addingNumbers;
    @Before
    public void setUp(){
        addingNumbers=new AddingNumbers();
    }
    @Test
    public void addingOfNumbers()
    {
        int sum=addingNumbers.Adding(new int[]{10,20,30,40});
        assertEquals(100,sum);
    }
    @Test
    public void addingOfNumbersgivesInteger()
    {
        int sum=addingNumbers.Adding(new int[]{11,20,30,40});
        assertEquals(101,sum);
    }
    @After
    public void tearDown(){
        addingNumbers=null;
    }
}