package array_questions;

import java.util.ArrayList;

public class No_of_Occurence_index {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,2,3,4,5,2,3,4,5,2,4,6,4,2,4,6,4,2,1};

        System.out.println(occerences(arr,2,0,new ArrayList<Integer>())); // new Arraylist<>() will create an empty list

    }

    static ArrayList<Integer> occerences(int[] arr , int target , int index , ArrayList<Integer> list)
    {
        if(index == arr.length/2)
        {
            return list ;
        }
        else if(arr[index] == target)
        {
            list.add(index);
        }
        if(arr[arr.length - index - 1] == target)
        {
            list.add(arr.length - index - 1);
        }
        return occerences(arr, target, ++index, list);
    }
}
