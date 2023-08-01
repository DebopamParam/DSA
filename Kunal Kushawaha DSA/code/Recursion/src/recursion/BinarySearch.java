package recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,14};
        System.out.println(BS(arr,0,arr.length-1,17));
    }

    static int BS(int[] arr , int start , int end , int key)
    {
//        if(start==end)
//        {
//            if(arr[start]==key)
//            {
//                return start;
//            }
//            else
//            {
//                return -1;
//            }
//        }

        if(start>end)
        {
            return -1;
        }

        int mid = start + (end-start)/2;
        if(key==arr[mid])
        {
            return mid;
        }
        else if (key > arr[mid])
        {
            return BS(arr,mid+1, end, key);
        }
        else
        {
            return BS(arr, start, mid-1, key);
        }
    }

}
