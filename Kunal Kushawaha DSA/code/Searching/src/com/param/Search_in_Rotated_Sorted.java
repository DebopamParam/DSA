package com.param;

public class Search_in_Rotated_Sorted {

    public static void main(String[] args) {
        int[] arr = {15,16,17,18,19,-2,-1,0,1,2,3,4,5,6,7,8,9,10,11,12,13};
        System.out.println(search(arr,2));
        System.out.println(findPivot_dup(new int[] {2,2,9,2,2,2,2,2,2}));
    }

    static int search(int[] nums, int target) {
        int pivot = findPeak(nums);

        if(pivot == -1)
        {
            //Array is not rotated
            return binarySearch(nums,target,0, nums.length-1);
        }
        if(nums[pivot]==target)
        {
            return pivot;
        }
        if(target>nums[0])
        {
            return binarySearch(nums,target,0,pivot-1);
        }
        return binarySearch(nums,target,pivot+1,nums.length-1);

    }

    static int findPeak(int[] arr)
    {
        int start = 0 , end = arr.length - 1;
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(mid<end && arr[mid+1]<arr[mid])
            {
                return mid;
            }
            if(mid>start && arr[mid-1]>arr[mid])
            {
                return mid-1;
            }
            if(arr[start]>=arr[mid])
            {
                //It means mid lies after peak & all the number after it is smaller than peak
                end = mid-1;
            }
            else
            {
                //it lies in the 1st sorted array (behind peak)
                start = mid+1;
            }
        }
        return -1;
    }


    static int binarySearch(int[] arr , int target , int start , int end)
    {
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(target>arr[mid])
            {
                start = mid+1;
            }
            else
            {
                end = mid-1 ;
            }
        }
        return -1;
    }

    //Find pivot in duplicate sorted array
    static int findPivot_dup(int[] arr)
    {
        int start = 0 , end = arr.length-1;
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1])
            {
                return mid;
            }
            if(mid>start && arr[mid-1]>arr[mid])
            {
                return mid-1;
            }

            // Checks to be done (Check Kunal's code RBS)

            if(arr[start]<arr[mid] || (arr[start]==arr[mid] && arr[mid]>arr[end]))
            {
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }
        }
        return -1;
    }

//    static int search(int[] nums, int target) {
//        int n = nums.length;
//        int l=0; int r=n-1;
//        while(l<=r){
//            int mid = (l+r)/2;
//            if(nums[mid] == target){
//                return mid;
//            }
//            if(nums[l]<=nums[mid]){
//                if(target>=nums[l] && target<=nums[mid]){
//                    r = mid-1;
//                }else{
//                    l=mid+1;
//                }
//            }
//            else{
//                if(target<=nums[r] && target>=nums[mid]){
//                    l = mid+1;
//                }
//                else{
//                    r = mid-1;
//                }
//            }
//        }
//        return -1;
//    }

}


