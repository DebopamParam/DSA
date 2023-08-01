package com.param;

import java.util.ArrayList;
import java.util.Scanner;

public class FindUnique {

    static int unique(int[] arr)
    {
        int ans = 0 ;
        for (int j : arr) {
            ans = ans ^ j;
        }
        return ans;
    }


    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);
        System.out.println("Enter 5 elements: ");

        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(unique(arr));


    }

}
