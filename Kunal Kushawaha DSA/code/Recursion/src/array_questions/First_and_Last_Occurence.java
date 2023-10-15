package array_questions;

import java.util.ArrayList;

public class First_and_Last_Occurence {

    public static void main(String[] args) {
        int[] arr = {1,2,2,2,2,3,4,5,6,7,8};
        System.out.println(first_n_last(arr,2));
    }

    static ArrayList<Integer> first_n_last(int[] arr , int target)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int first_occerence = find_range(arr , target , true);
        int last_occerence = find_range(arr , target , false);
        list.add(first_occerence);
        list.add(last_occerence);
        return list;
    }

    private static int find_range(int[] arr, int target, boolean isFirst) {
        int start = 0 , end = arr.length - 1 ;
        return helper(arr,target,isFirst,start,end);
    }

    private static int helper(int[] arr, int target, boolean isFirst, int start, int end) {

        if(start>end)
        {
            return -1;
        }
        int mid = start + (end-start) /2 ;
        if(target>arr[mid])
        {
            return helper(arr,target,isFirst,mid+1,end);
        } else if (target<arr[mid])
        {
            return helper(arr, target, isFirst, start, mid-1);
        }
        else
        {
            if(isFirst && (mid-1)>=0 && arr[mid-1]==target)
            {
                return helper(arr, target, isFirst, start, mid-1);
            } else if (!isFirst && (mid+1)<arr.length && arr[mid+1]==target) {
                return helper(arr, target, isFirst, mid+1, end);
            }
            else
            {
                return mid;
            }
        }

    }

}
