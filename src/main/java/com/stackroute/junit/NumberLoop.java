package com.stackroute.junit;

import java.util.Scanner;

public class NumberLoop {
    public static String repeatativeNumber(int n) //repeating a given number for a number of times
    {
        String string="";
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<i;j++)
            {
                string=string+i;
            }

        }
        return string;
    }

}
