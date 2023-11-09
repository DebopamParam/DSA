package Sub_Sets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Using_Iteration {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2};
//        System.out.println(subset(arr));
        System.out.println(subset_dup(arr));

    }

    static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num : arr) {
            // List of subsets will be previous answers plus inner till now
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                // We get the previous answer till now in the constructor(outer.get(i)) and add one by one in corresponding inner_list
                //Check notes for better understanding
                List<Integer> inner = new ArrayList<Integer>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }

//    static List<List<Integer>> subset_dup(int[] arr) {
//        Arrays.sort(arr);
//
//        List<List<Integer>> outer = new ArrayList<>();
//        outer.add(new ArrayList<Integer>());
//
//        for (int i = 0; i < arr.length; i++) {
//            int n = outer.size();
//            // n will be always even,because, outer is the list of the Subsets & no. of subsets is always Even --> (2^n)
//            int k = 1;
//            if (i > 0 && arr[i - 1] == arr[i]) {
//                k = 2;
//            }
//            for (int j = 0; j < n / k; j++) {
//                List<Integer> inner = new ArrayList<>();
//                if (k == 2) {
//                    int offset = n / k;
//                    inner.addAll(outer.get(j + offset));
//                } else {
//                    inner.addAll(outer.get(j));
//                }
//                inner.add(arr[i]);
//                outer.add(inner);
//            }
//        }
//        return outer;
//
//    }

    //Kunal Method
    static List<List<Integer>> subset_dup(int[] arr) {
        Arrays.sort(arr);

        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<Integer>());

        int start = 0, end = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i - 1] == arr[i]) {
                start = end + 1;
            }
            end = outer.size() - 1;
            for (int j = start; j <= end; j++) {
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }
        return outer;

    }

}
