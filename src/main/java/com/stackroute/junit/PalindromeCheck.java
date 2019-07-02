package com.stackroute.junit;

import java.util.Scanner;

public class PalindromeCheck {
    public static String palindromeCheck(int n) //checking whether a number is palindrome
    {
        int temp, r, sum, add;
        String string="";
        sum = 0;
        add = 0;
        temp = n;
        while (n != 0)
        {
            r = n % 10;
            sum = sum * 10 + r;
            n = n / 10;
            if (r % 2 == 0)
            {
                add = add + r;
            }
        }
        if (sum == temp) //palindrome check
        {

            if (add > 25)
            {
                string=temp+ " is palindrome and the sum of even numbers is greater than 25";
            }
            else
                {

                string=temp + " is a palindrome and the sum of even numbers is less than 25";
            }

        }
        else {
            string=temp+" is not a palindrome";
        }
        return string;
    }

}
