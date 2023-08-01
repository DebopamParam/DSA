package com.param;

public class Search_in_Mountain_Array {

    public static void main(String[] args) {
        int[] a = {0,1,2,4,2,1};
        System.out.println(search(a,1));
    }

    static int search(int[] arr , int target)
    {
        int index = -1;
        int peak = find_peak(arr);
        int start1 = 0 , end1 = peak;
        int start2 = peak , end2 = arr.length-1;

        index = bin_search(arr,target,start1,end1);

        if(index==-1)
        {
            index = bin_search(arr,target,start2,end2);
        }

        return index;
    }

    static int bin_search(int[] arr , int target ,int start , int end)
    {
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            boolean isAscending = arr[start]<arr[end];

            if(target<arr[mid])
            {
                if(isAscending)
                {
                    end = mid -1;
                }
                else
                {
                    start = mid+1;
                }
            } else if (target>arr[mid]) {
                if (isAscending)
                {
                    start = mid+1;
                }
                else
                {
                    end = mid-1;
                }
            }
            else
            {
                return mid ;
            }
        }
        return -1;
    }


    static int find_peak(int[] arr)
    {
        int start = 0 , end = arr.length - 1 ;
        int mid = -1;
        while(start<end)
        {
            mid = start + (end-start)/2;
            if(arr[mid+1]>arr[mid]) //Increasing part of the array
            {
                start = mid + 1 ;
            }
            else if (arr[mid+1]<arr[mid]) //Decreasiing part of the array
            {
                if(arr[mid-1]<arr[mid])
                {
                    return mid;
                }
                end = mid-1;
            }
        }
        return mid ;
    }
}

