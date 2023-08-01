package com.param;

import java.util.Arrays;
import java.util.Scanner;

public class Pairs_in_Array {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int []arr = new int [5];

        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")  ");
            }
            System.out.println();

        }
    }

}
