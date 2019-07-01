package com.stackroute.junit;

import java.util.Scanner;

public class StringPattern {
    public static String Repeat(String str, int n) //printing a pattern if given string
    {
        int len = str.length();
        String string=str;
        int j = len - n;
        for (int k = 0; k < n; k++) {

            for (int i = j; i < len; i++) {
                string=string+str.charAt(i);

            }
        }
        return string;
    }
}


