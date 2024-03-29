package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeCheckTest {
    PalindromeCheck palindromecheck;
    @Before
    public void setUp(){
        palindromecheck=new PalindromeCheck();
    } //creating an object
    @Test
    public void checkWhetherItIsPalindrome(){
        String result=palindromecheck.palindromeCheck(6789876);
        assertEquals("6789876 is palindrome and the sum of even numbers is greater than 25",result);
    }
    @Test
    public void checkWhetherItIsNotPalindrome(){
        String result=palindromecheck.palindromeCheck(1234);
        assertEquals("1234 is not a palindrome",result);
    }
    @Test
    public void checkWhetherItIsPalindromeAndSumIsLessThan25(){
        String result=palindromecheck.palindromeCheck(1234321);
        assertEquals("1234321 is a palindrome and the sum of even numbers is less than 25",result);
    }
    @After
    public void tearDown(){
        palindromecheck=null;
    }


}