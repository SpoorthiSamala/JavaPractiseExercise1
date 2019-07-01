package com.stackroute.junit;

import java.util.Scanner;

public class VowelsConsonantsChecker {
    public static String Check(String str) //checking whether a given character is vowel or consonant
    {
        int i;
        String string="";
        int len=str.length();
        for(i=0;i<len;i++)
        {
            char c= str.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            {
                string=string+"Vowel"+" ";
            }
            else
            {
                string=string+"Consonant"+" ";
            }
        }
        return string;
    }
}
