package com.stackroute.junit;

import java.util.Scanner;

public class OddEvenChecker {
    public static String  oddEven(int number) //checking whether a given number is odd or even
    {
        if(number>20 & number<30){
            if(number%2!=0)
                return "Tom";
            else
                return "Jerry";
        }
        return "Incorrect Input";

    }


    }

