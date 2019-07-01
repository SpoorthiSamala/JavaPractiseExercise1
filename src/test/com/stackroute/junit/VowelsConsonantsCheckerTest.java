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
    }
    @Test
    public void checkWhetherItIsAVowel()
    {
        String result=vowelsConsonantsChecker.Check("a");
        assertEquals("Vowel ",result);
    }

    @Test
    public void checkWhetherItIsAConsonant()
    {
        String result=vowelsConsonantsChecker.Check("b");
        assertEquals("Consonant ",result);
    }
    @Test
    public void checkWhetherItIsAConsonantAndVowel()
    {
        String result=vowelsConsonantsChecker.Check("ap");
        assertEquals("Vowel Consonant ",result);
    }
    @After
    public void tearDown(){
        vowelsConsonantsChecker=null;
    }


}