package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckingTheInputCharacterTest {
    CheckingTheInputCharacter checkingTheInputCharacter;
    @Before
    public void setUp(){
        checkingTheInputCharacter =new CheckingTheInputCharacter();

    }
    @Test
    public void checkWhetherInputIsCapitalLetter()
    {
        String result= checkingTheInputCharacter.characterChecking('A');
        assertEquals("Capital Letter",result);
    }
    @Test
    public void checkWhetherInputIsSmallCaseLetter()
    {
        String result= checkingTheInputCharacter.characterChecking('a');
        assertEquals("Smallcase Letter",result);
    }
    @Test
    public void checkWhetherInputIsDigit()
    {
        String result= checkingTheInputCharacter.characterChecking('1');
        assertEquals("Digit",result);
    }
    @Test
    public void checkWhetherInputIsSpecialCharacter()
    {
        String result= checkingTheInputCharacter.characterChecking('@');
        assertEquals("Special Symbol",result);
    }

    @After
    public void tearDown()
    {
        checkingTheInputCharacter =null;
    }


}