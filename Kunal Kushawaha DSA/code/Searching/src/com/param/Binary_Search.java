package com.param;

public class Binary_Search {

    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8,9,11,12,13,14,15,16,17};
        System.out.println(search(num,16));
    }

    //Return the index
    //Otherwise return -1
    static int search(int[] arr, int target)
    {
        int start = 0 , end = arr.length-1 ;
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(arr[mid]==target)
            {
                return mid ;
            }
            else if (target>arr[mid]) {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
        }
        //If target is not found return -1
        return -1;
    }

}
