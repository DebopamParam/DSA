package array_questions;

public class Linear_Search {
    public static void main(String[] args) {
        int[] arr = {2 , 4 , 6 ,7 , 9 ,12, 34,11};
        System.out.println(linearSearch(arr,11,0));
    }

    static int linearSearch(int[] arr , int target , int index)
    {
        if(arr.length==0 || index == arr.length/2)
        {
            return -1;
        }
        if(arr[index]==target)
        {
            return index;
        }
        if(arr[arr.length - index - 1 ] == target)
        {
            return arr.length - index - 1;
        }
        return linearSearch(arr,target,++index);
    }
}
