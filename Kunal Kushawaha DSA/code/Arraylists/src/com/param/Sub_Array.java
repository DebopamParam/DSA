package com.param;

import java.util.Arrays;

public class Sub_Array {

    /* max & min Sum of Sub_Array (Brute Force)  O(n^3)  */
//    static void max_sum(int[] arr)
//    {
//        int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i; j < arr.length; j++) {
//                int sum = 0 ;
//                for (int k = i; k <= j; k++) {
//                    sum+=arr[k];
//                }
//                min = Math.min(sum , min);
//                max = Math.max(sum , max);
//
//            }
//        }
//        System.out.println("Max Sum of individual SubArrays = "+max);
//        System.out.println("Min Sum of individual SubArrays = "+min);
//    }


    /*Prefix Method   O(n^2)  */
//    static void max_sum(int[] arr) {
//
//        int []prefix_arr = new int[arr.length];
//        /*Storing the Sums of all the Consecutive numbers in a Prefix Array
//        Eg: arr=[1,2,3,4] --> prefix[0]=arr[0]
//                          --> prefix[1]=arr[0]+arr[1]
//                          --> prefix[2]=arr[0]+arr[1]+arr[2]
//        */
//
//        int max = arr[0];
//
//        prefix_arr[0]=arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            prefix_arr[i]=prefix_arr[i-1]+arr[i];
//            max = Math.max(prefix[i],max);
//        }
//
//        for (int start = 1; start < arr.length; start++) {
//            for (int end = start; end < arr.length; end++) {
//                int sum = prefix_arr[end]-prefix_arr[start-1];
//                if(sum>max)
//                {
//                    max=sum;
//                }
//            }
//        }
//        System.out.println("Max sum of Sub_Array: " + max);
//    }


    /*Kadane's Method   O(n)  */
    static void max_sum(int[] arr)
    {
        int curr_sum= 0 ;
        int max=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            curr_sum=Math.max(arr[i],curr_sum+arr[i]);
            max=Math.max(max,curr_sum);
        }

        System.out.println(max);

    }


    static void print_sub_Arrays(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("[");
                for (int k = i; k <=j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.print("]");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        int[] arr = {-2,-3,-7,-9,-1};

        print_sub_Arrays(arr);
        max_sum(arr);

    }

}
