package sorting;

import static sorting.Bubble_Sort.print;

public class Selection_sort {
    public static void main(String[] args) {
        int[] arr = {5,3,1,6,2,4,9,5,3,43,12,65,9,47};
        int[] arr2 = {3,1,6,2,4,9,5,3,43,12,65,9,47};
        sort(arr,0,1);
        print(arr);
        sort_kunal(arr2,arr2.length-1,0,0);
        System.out.println();
        print(arr2);
    }
    static void sort(int[] arr , int start_index, int iterator)
    {
        if(arr.length<=1)
        {
            return;
        }
        if(start_index==arr.length-1)
        {
            return;
        }
        if(iterator<arr.length)
        {
            if(arr[iterator]<arr[start_index])
            {
                swap(arr,iterator,start_index);
            }
            sort(arr,start_index,++iterator);
        }
        else
        {
            sort(arr,start_index+1,start_index+2);
        }
    }

    static void sort_kunal(int[] arr , int last_index , int curr_index , int max_index)
    {
        if(arr.length<=1)
        {
            return;
        }
        if(last_index==0)
        {
            return;
        }

        if(curr_index<=last_index)
        {
            if(arr[curr_index]>arr[max_index])
            {
                max_index = curr_index;
            }
            sort_kunal(arr,last_index,curr_index+1,max_index);
        }
        else
        {
            swap(arr,max_index,last_index);
            sort_kunal(arr,last_index-1,0,0);
        }
    }
    static void swap(int[] arr , int i , int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
