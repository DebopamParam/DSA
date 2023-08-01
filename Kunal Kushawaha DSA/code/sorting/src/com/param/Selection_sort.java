package com.param;

import java.util.Arrays;

public class Selection_sort {
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
        System.out.println(Arrays.toString(selection_sort(arr)));
    }

//    static int[] selection_sort(int[] arr)
//    {
//        for(int i = 0 ; i<arr.length-1 ; i++)
//        {
//            int min = i ;
//            for(int j = i+1 ; j<arr.length ; j++)
//            {
//                if(arr[j]<arr[min])
//                {
//                    min = j;
//                }
//            }
//            if(arr[min]!=arr[i])
//            {
//                int temp = arr[i];
//                arr[i] = arr[min];
//                arr[min] = temp;
//            }
//        }
//
//        return arr;
//    }

    static int[] selection_sort(int[] arr)
    {
        for(int i = 0 ; i<arr.length-1 ; i++)
        {
            int max = 0 ;
            for(int j = 1 ; j <= arr.length - i - 1 ; j++)
            {
                if(arr[j]>arr[max])
                {
                    max = j;
                }
            }
            if(arr[max]!=arr[arr.length - i - 1])
            {
                int temp = arr[arr.length - i - 1];
                arr[arr.length - i - 1] = arr[max];
                arr[max] = temp;
            }
        }

        

        return arr;
    }
}
