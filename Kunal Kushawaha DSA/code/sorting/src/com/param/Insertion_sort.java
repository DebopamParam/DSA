package com.param;

import java.util.Arrays;
import java.util.Random;

public class Insertion_sort
{
    public static void main(String[] args) {
        int[] arr = new int[15];

        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        insertion_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion_sort(int[] arr)
    {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j>0 ; j--) {
                if(arr[j]<arr[j-1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]=temp;
                }
                else
                {
                    break;
                }
            }
        }
    }
}
