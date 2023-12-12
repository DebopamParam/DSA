package BackTracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Leetcode_60 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter size : ");
        int n = in.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i + 1);
        }
        System.out.println(list);
        List<Integer> clone = list.subList(2, list.size());
        System.out.println(clone);

        System.out.println(list.get(3));
    }
}
