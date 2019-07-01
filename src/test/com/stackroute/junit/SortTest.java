package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortTest {
    Sort sort;
    @Before
    public void setUp(){
        sort=new Sort();

    }
    @Test
    public void sortAndDisplayTheSumOfEvenNumbers(){
        String result=sort.Sorting(new int[]{10,20,30,40});
        assertEquals("sum of the number is 100",result);
    }
    @Test
    public void sortAndDisplaysTheSumOfEvenNumbers(){
        String result=sort.Sorting(new int[]{1,2,3,4});
        assertEquals("sum of the number is 6",result);
    }
    @After
    public void tearDown(){
        sort=null;
    }

}