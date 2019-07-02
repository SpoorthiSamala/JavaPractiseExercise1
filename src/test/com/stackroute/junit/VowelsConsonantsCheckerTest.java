package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelsConsonantsCheckerTest {
    VowelsConsonantsChecker vowelsConsonantsChecker;
    @Before
    public void setUp()
    {
        vowelsConsonantsChecker=new VowelsConsonantsChecker();
    } //creating an object
    @Test
    public void checkWhetherTheInputIsAVowel()
    {
        String result=vowelsConsonantsChecker.checkTheString("a");
        assertEquals("Vowel ",result);
    }

    @Test
    public void checkWhetherInputIsAConsonant()
    {
        String result=vowelsConsonantsChecker.checkTheString("b");
        assertEquals("Consonant ",result);
    }
    @Test
    public void checkWhetherInputIsAConsonantAndVowel()
    {
        String result=vowelsConsonantsChecker.checkTheString("ap");
        assertEquals("Vowel Consonant ",result);
    }
    @After
    public void tearDown(){
        vowelsConsonantsChecker=null;
    }


}