package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuessNumberTest {
    GuessNumber guessNumber;
    @Before
    public void setUp(){
        guessNumber=new GuessNumber();

    }
    @Test
    public void checkingGuessMatchesTheOriginalNumber()
    {
        String result=guessNumber.Checking(45);
        assertEquals("Number guessed matches the original number",result);
    }
    @Test
    public void checkingGreaterThanTheOriginalNumber()
    {
        String result=guessNumber.Checking(47);
        assertEquals("Number guessed is more than the original number",result);
    }
    @Test
    public void checkingSmallerThanTheOriginalNumber()
    {
        String result=guessNumber.Checking(40);
        assertEquals("Number guessed is less than the original number",result);
    }
    @Test
    public void checkingNumberErrorMessage()
    {
        String result=guessNumber.Checking(52);
        assertEquals("Number not in range",result);
    }
    @After
    public void tearDown(){
        guessNumber=null;
    }
}