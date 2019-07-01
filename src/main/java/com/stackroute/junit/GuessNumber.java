package com.stackroute.junit;

import java.util.Scanner;

public class GuessNumber {
    public static String Checking(int number) //guessing the correct number that matches the target number
    {
        String str="";
        int target = 45;
        if (number > 1 & number < 50) {
            if (number == target) {
                str="Number guessed matches the original number";
            }
            if (number > target) {
                str="Number guessed is more than the original number";
            }
            if (number < target) {
                str="Number guessed is less than the original number";
            }
        }
        else {
            str = "Number not in range";
        }
        return str;
    }
}
