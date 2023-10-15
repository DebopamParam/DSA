package sorting;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,7,1,2,0};
        sort(arr,arr.length,0);
        print(arr);

        int[] arr2={5,4,6,3,2,1};
        insertion_sort(arr2);
        System.out.println();
        print(arr2);
    }

    static void print(int[] arr)
    {
        for (int i = 0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    static void sort(int[] arr , int size , int j)
    {
        if(size==1)
        {
            return;
        }
        if(j<size-1)
        {
            if(arr[j]>arr[j+1])
            {
                swap(arr,j,j+1);
            }
            sort(arr,size,++j);
        }
        else
        {
            sort(arr,--size,0);
        }
    }

    static void swap(int[] arr , int i , int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void insertion_sort(int[] arr)
    {
        for(int i = 1 ; i<arr.length ; i++)
        {
            for(int j = i ; j>0 ; j--)
            {
                if(arr[j]<arr[j-1])
                {
                    swap(arr,j,j-1);
                }
                else
                {
                    break;
                }
            }
        }
    }
}
