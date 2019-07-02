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
    } //creating an object
    @Test
    public void givenInputArrayOfIntegersReturnsSum()
    {
        int sum=addingNumbers.addingNumbers(new int[]{10,20,30,40}); //giving input in an array
        assertEquals(100,sum);
    }
    @Test
    public void givenInputArrayOfIntegersReturnSum()
    {
        int sum=addingNumbers.addingNumbers(new int[]{11,20,30,40});
        assertEquals(101,sum);
    }
    @Test
    public void givenInputArrayOfIntegersWhichContainsNegativeIntegersReturnSum()
    {
        int sum=addingNumbers.addingNumbers(new int[]{1,2,4,-4});
        assertEquals(3,sum);
    }
    @After
    public void tearDown(){
        addingNumbers=null;
    }
}