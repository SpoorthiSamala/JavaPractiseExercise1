package com.stackroute.junit;

public class CapitalorNot {
    public static String CharacterChecking(char ch) //used for checking the given character
    {
        if(ch>=65 && ch<=90)
        {
            return "Capital Letter";
        }
        else if (ch>=97 && ch<=122)
        {
            return "Smallcase Letter";
        }
        else if (ch>=48 && ch<=57)
        {
            return "Digit";
        }
        else if((ch>0 && ch<=47)||(ch>=58 && ch<=64)||(ch>=91 && ch<=96)||(ch>=123 && ch<=127))
        {
            return "Special Symbol";
        }
        else
        return null;
    }
}
