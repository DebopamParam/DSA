package com.param;

/*
    Syntax

    datatype[] variable_name = new datatype[size];

*/

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
//        int[] arr; //Declaration : arr(reference) is being created in Stack
//        arr=new int[5]; //Initialization : Actually here , objects are being created in heap

        int[] x = new int[5];
        for (int i = 0; i < x.length; i++) {
            x[i]=in.nextInt();
        }

        System.out.print(java.util.Arrays.toString(x));

        change(x);

        System.out.print(java.util.Arrays.toString(x));

    }

    private static void change(int[] arr) {
        arr[0]=12;
    }
}
