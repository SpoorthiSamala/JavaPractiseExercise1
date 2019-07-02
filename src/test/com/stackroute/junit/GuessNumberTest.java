package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuessNumberTest {
    GuessNumber guessNumber;
    @Before
    public void setUp(){
        guessNumber=new GuessNumber(); //creating object for the GuessNumber class

    }
    @Test
    public void checkWhetherGuessNumberMatchesTheOriginalNumber()
    {
        String result=guessNumber.checkingTarget(45);
        assertEquals("Number guessed matches the original number",result);
    }
    @Test
    public void checkWhetherGuessNumberIsGreaterThanTheOriginalNumber()
    {
        String result=guessNumber.checkingTarget(47);
        assertEquals("Number guessed is more than the original number",result);
    }
    @Test
    public void checkWhetherGuessNumberIsSmallerThanTheOriginalNumber()
    {
        String result=guessNumber.checkingTarget(40);
        assertEquals("Number guessed is less than the original number",result);
    }
    @Test
    public void checkWhetherInputNumberIsInRange()
    {
        String result=guessNumber.checkingTarget(52);
        assertEquals("Number not in range",result);
    }
    @After
    public void tearDown(){
        guessNumber=null;
    }
}