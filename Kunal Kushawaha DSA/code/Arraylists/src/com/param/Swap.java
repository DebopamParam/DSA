package com.param;

import java.util.Arrays;

public class Swap {

    public static void main(String[] args) {

        int []arr = {1,2,3,4,2};

        swap(arr, 0 , arr.length-1);

        System.out.println(Arrays.toString(arr));

        max(arr);

    }

    static void swap(int[] arr , int index1 , int index2)
    {
        int temp ;
        temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }

    static void max(int[] arr)
    {
        int max = arr[0];
        for (int x : arr) {
            if (x > max) {
                max = x;
            }
        }
        System.out.println(max);
    }


}
