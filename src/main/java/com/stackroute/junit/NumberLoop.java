package com.stackroute.junit;

import java.util.Scanner;

public class NumberLoop {
    public static String Repeatative(int n) //repeating a given number for a number of times
    {
        String str="";
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<i;j++)
            {
                str=str+i;
            }

        }
        return str;
    }

}
