package com.stackroute.junit;

import java.util.Scanner;

public class AddingNumbers {
    public static int Adding(int array[]) //this method is used for adding numbers
    {

        int  sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }
}
