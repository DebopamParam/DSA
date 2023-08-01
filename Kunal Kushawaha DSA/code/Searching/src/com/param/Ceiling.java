package com.param;

public class Ceiling {

    public static void main(String[] args) {
        int[] nums = {1, 3 ,5,7,9 ,12,14,16,19,21,24,27};

        System.out.println(ceiling(nums , 15));
    }

    static int ceiling(int[] arr , int target)
    {
        int start = 0 , end = arr.length-1;
        while(start<=end)
        {
            int mid = start + (end-start)/2 ;

            if(target<arr[start])
            {
                return start;
            }
            if(target>arr[end])
            {
                return end+1;
            }

            //If found then return the Index
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(target>arr[mid])
            {
                start = mid + 1;
            }
            else
            {
                end = mid-1;
            }
        }
        //If search is unsuccessful , (end = mid) & ( start = mid +1 )
        // return "start".
        return start ;
    }


}
