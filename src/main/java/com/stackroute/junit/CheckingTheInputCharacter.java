package com.stackroute.junit;

public class CheckingTheInputCharacter {
    public static String characterChecking(char ch) //used for checking the given character
    {
        String string="";
        if(ch>=65 && ch<=90)
        {
            string="Capital Letter";
        }
        else if (ch>=97 && ch<=122)
        {
            string="Smallcase Letter";
        }
        else if (ch>=48 && ch<=57)
        {
            string="Digit";
        }
        else if((ch>0 && ch<=47)||(ch>=58 && ch<=64)||(ch>=91 && ch<=96)||(ch>=123 && ch<=127))
        {
            string="Special Symbol";
        }
        return string;
    }
}
