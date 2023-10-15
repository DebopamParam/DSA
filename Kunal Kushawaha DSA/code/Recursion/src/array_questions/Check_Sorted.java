package array_questions;

public class Check_Sorted {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,2,9,12};
        System.out.println(check_sorted(arr));
    }

    static boolean check_sorted(int[] arr)
    {   if(arr.length==0)
        {
            return true;
        }
        int index = 0 ;
        return helper(arr,index);
    }

    private static boolean helper(int[] arr, int index) {

        if(index==arr.length-1)
        {
            return true;
        }
        return (arr[index]<arr[index+1] && helper(arr,++index));
    }

}
