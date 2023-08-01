package com.param;

// https://leetcode.com/problems/missing-number/
// Given an array nums containing n distinct numbers in the range [0, n],
// return the only number in the range that is missing from the array.
public class Missing_Number {
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        System.out.println(missingNumber(arr));
    }

    static int missingNumber(int[] nums) {

        cyclic(nums);
        for(int i = 0 ; i<nums.length ; i++)
        {
            if(nums[i]!=i)
            {
                return i ;
            }
        }

        return nums.length;

    }
    static void cyclic(int[] arr)
    {
        int i = 0 ;
        while(i<arr.length)
        {
            int correct = arr[i];
            if( arr[i]<arr.length && arr[i]!=arr[correct])
            {
                swap(arr,i,correct);
            }
            else
            {
                i++;
            }
        }
    }

    static void swap(int[] arr , int first , int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
