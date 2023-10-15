package array_questions;

public class Rotated_BS {
    public static void main(String[] args) {
        int[] arr = {15,16,17,18,19,-2,-1,0,1,2,3,4,5,6,7,8,9,10,11,12,13};

        System.out.println(search(arr,12,0,arr.length-1));
        System.out.println(arr.length);

    }

    static int search(int[] arr , int target , int start , int end)
    {
        int mid = start + (end-start)/2;
        if(start>end)
        {
            return -1;
        }
        if(arr[mid]==target)
        {
            return mid;
        }
        else if (arr[start]<=arr[mid]) // array from start till mid is sorted
        {
            if (target>=arr[start] && target<=arr[mid])
            {
                return search(arr,target,start,mid-1);
            }
            else
            {
                return search(arr,target,mid+1,end);
            }
        }
        else
        {
            if(target>=arr[mid] && target<=arr[end])
            {
                return search(arr,target,mid+1,end);
            }
            else
            {
                return search(arr,target,start,mid-1);
            }
        }
    }




//    static int search(int[] arr , int target)
//    {
//        int pivot = pivot(arr,0, arr.length-1);
//        if(pivot == -1)
//        {
//            return bs(arr,target,0,pivot);
//        }
//        if(target >= arr[0])
//        {
//            return bs(arr,target,0,pivot);
//        }
//        return bs(arr,target,pivot+1,arr.length-1);
//    }
//
//    static int pivot(int[] arr , int start , int end)
//    {
//        int mid = start + (end-start)/2 ;
//        if(start>end)
//        {
//            return -1;
//        }
//        if(start>=0 && mid<arr.length && arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1])
//        {
//            return mid;
//        }
//        else if (arr[mid]>arr[start])
//        {
//            return pivot(arr,mid+1, end);
//        }
//        else
//        {
//            return pivot(arr,start,mid-1);
//        }
//    }
//
//    static int bs(int[] arr , int target , int start , int end)
//    {
//        if(start>end)
//        {
//            return -1;
//        }
//        int mid = start + (end-start)/2;
//        if(arr[mid] == target)
//        {
//            return mid;
//        } else if (target > arr[mid]) {
//            return bs(arr,target,mid+1,end);
//        }
//        else
//        {
//            return bs(arr,target,start,mid-1);
//        }
//    }

}
