package com.param;

import java.util.Arrays;

public class Cyclic_Sort {

    // This can be applied when it is specified that the array elements ranges from  " 1 to N "

    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
        System.out.println(Arrays.toString(arr));
        cyclic_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // My method
    static void cyclic_sort(int[] arr)
    {
        int i = 0;
        while (i < arr.length) {
            int correct_index=arr[i]-1;
            if(arr[i]-1 != i)
            {
                swap( arr, i,correct_index);
            }
            else {
                i++;
            }
        }
    }
    static void swap(int[] arr , int i , int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
