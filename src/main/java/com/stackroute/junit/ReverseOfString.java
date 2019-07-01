package com.stackroute.junit;

import java.util.Scanner;

public class ReverseOfString {
    public static String RevString(String str) //reversing the given string
    {
        String string="";
        int len=str.length();
        for(int i=len-1;i>=0;i--)
        {
            string=string+str.charAt(i);
        }
        return string;
    }

}
