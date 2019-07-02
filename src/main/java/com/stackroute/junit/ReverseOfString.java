package com.stackroute.junit;

import java.util.Scanner;

public class ReverseOfString {
    public static String revString(String str) //reversing the given string
    {
        String string="";
        int strlength=str.length();
        for(int i=strlength-1;i>=0;i--)
        {
            string=string+str.charAt(i);
        }
        return string;
    }

}
