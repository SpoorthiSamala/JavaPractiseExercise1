package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OddEvenCheckerTest {
    OddEvenChecker oddEvenChecker;
    @Before
    public void setUp(){
        oddEvenChecker=new OddEvenChecker();
    }
    @Test
    public void checkWhetherItIsOdd(){
        String result=oddEvenChecker.oddeven(23);
        assertEquals("Tom",result);
    }
    @Test
    public void checkWhetherItIsEven(){
        String result=oddEvenChecker.oddeven(26);
        assertEquals("Jerry",result);
    }
    @Test
    public void checkWhetherInputIsCorrect(){
        String result=oddEvenChecker.oddeven(36);
        assertEquals("Incorrect Input",result);
    }
    @After
    public void tearDown(){
        oddEvenChecker=null;
    }

}