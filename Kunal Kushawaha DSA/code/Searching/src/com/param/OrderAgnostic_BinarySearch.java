package com.param;

public class OrderAgnostic_BinarySearch {
    public static void main(String[] args) {

    }

    static int OrderAgnostic_BS(int[] arr , int target)
    {
        int start = 0 , end = arr.length-1 ;

        boolean isAscending = arr[start] <= arr[end];

        while(start<=end)
        {
            int mid = (start+end)/2;
            if(arr[mid]==target)
            {
                return mid ;
            }
            else if (target>arr[mid]) {
                if(isAscending)
                {start = mid + 1;}
                else
                {end = mid-1;}
            }
            else
            {
                if(isAscending)
                {end = mid-1;}
                else
                {start = mid+1;}
            }
        }
        //If target is not found return -1
        return -1;
    }
}
