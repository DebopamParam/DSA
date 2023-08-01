package com.param;

import java.util.*;
import java.util.Arrays;

public class Array_2D {

    public static void main(String[] args) {

//        //Method 1
//        int[][] arr = new int[3][3];
//
//        //Method 2
//        int[][] arr2D = {
//                {1,2,3}, //0 th index
//                {3,4}, // 1st index
//                {5,6,7,8,9}// 2nd Index -> arr[2] = [5,6,7,8,9]
//        };


        // For variable number of Columns
        Scanner in  = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int row = in.nextInt();

        int [][] arr = new int[row][];

        for (int i = 0; i < arr.length; i++) {

            System.out.println("Number of elements in Column " + (i+1) + ": " );
            int col = in.nextInt();
            arr[i]=new int[col];
            System.out.println("\nEnter the elements of Column " + (i+1));
            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j]=in.nextInt();

            }
        }

        //output
        for(int[] a : arr)
        {
            System.out.println(Arrays.toString(a));
        }



    }

}