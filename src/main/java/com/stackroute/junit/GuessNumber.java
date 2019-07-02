package com.stackroute.junit;

import java.util.Scanner;

public class GuessNumber {
    public static String checkingTarget(int number) //guessing the correct number that matches the target number
    {
        String string="";
        int target = 45;
        if (number > 1 & number < 50) {
            if (number == target) {
                string="Number guessed matches the original number";
            }
            if (number > target) {
                string="Number guessed is more than the original number";
            }
            if (number < target) {
                string="Number guessed is less than the original number";
            }
        }
        else {
            string = "Number not in range";
        }
        return string;
    }
}
