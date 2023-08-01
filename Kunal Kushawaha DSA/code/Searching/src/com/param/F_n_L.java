package com.param;

import java.util.Arrays;

public class F_n_L {

    public static void main(String[] args) {

        int[] x = {5,7,7,7,7,7,7,7,8,8,10};

        int first = searchRange(x,7,true);
        int last = searchRange(x,7,false);

        int[] a = {first,last};
        System.out.println(Arrays.toString(a));

    }

    /*      My Approach    */

//    public static int[] searchRange(int[] nums, int target) {
//
//        int start_fo = 0 , start_lo = 0;
//        int end_fo = nums.length-1 , end_lo = nums.length -1 ;
//        int[] ans = {-1,-1};
//
//        if(nums.length==0)
//        {
//            return ans;
//        }
//
//        if(Arrays.binarySearch(nums,target)<0)
//        {
//            return ans;
//        }
//
//        while(start_fo <= end_fo || start_lo <= end_lo)
//        {
//            //Find First Occurence
//            //start_fo will give the index of the first occurence
//            if(start_fo <= end_fo)
//            {
//                int mid = start_fo+(end_fo-start_fo)/2;
//
//                if(target>nums[mid]) //greater than
//                {
//                    start_fo = mid+1;
//                }
//                else
//                {
//                    end_fo = mid - 1;
//                }
//            }
//
//            //Find the last occurence
//            //end_lo will give the last occurence
//            if(start_lo <= end_lo)
//            {
//                int mid = start_lo+(end_lo-start_lo)/2;
//
//                if(target>=nums[mid]) //greater than or equals to
//                {
//                    start_lo = mid+1;
//                }
//                else
//                {
//                    end_lo = mid - 1;
//                }
//            }
//        }
//
//
//
//        return new int[]{start_fo,end_lo};
//    }

    /*      Kunal's Approach    */

    public static int searchRange(int[] nums, int target,boolean isFirst)
    {
        int ans = -1 ;
        int start = 0 , end = nums.length-1;

        while (start<=end)
        {
            int mid = start + (end - start )/2;
            if(target<nums[mid])
            {
                end = mid-1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            }
            else
            {
                ans = mid;
                if(isFirst)
                {
                    end = mid-1;
                }
                else
                {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }




}
