package com.stackroute.junit;

import java.util.Scanner;

public class Sort {
    public static String sortingList(int array[]) //sorting the given array in descending order
    {
        int n, i, j, swap;
        String string = "";
        int sum = 0;
        n = array.length;
        for (i = 0; i < n - 1; i++) {
            for (j = i; j < (n - 1) - i; j++) {
                if (array[j] > array[j + 1]) {
                    swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
            }
        }

        string = "Sorted list of elements";
        for (i = n - 1; i >= 0; i--)
            System.out.println(array[i]);
        for (i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                sum = sum + array[i];
            }
        }
        string = "sum of the number is " + sum;
        if (sum > 15) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        return string;
    }
}


