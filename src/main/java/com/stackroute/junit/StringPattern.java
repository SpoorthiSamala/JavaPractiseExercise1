package com.stackroute.junit;

import java.util.Scanner;

public class StringPattern {
    public static String repeatPattern(String str, int n) //printing a pattern if given string
    {
        int stringlength = str.length();
        String string=str;
        int j = stringlength - n;
        for (int k = 0; k < n; k++) {

            for (int i = j; i < stringlength; i++) {
                string=string+str.charAt(i);

            }
        }
        return string;
    }
}


