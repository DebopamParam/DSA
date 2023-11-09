package Permutations;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        String str = "abcd";
        permutation("", str, 0);
        System.out.println(perm_list("", str, 0));
        System.out.println(count_perm("", str, 0));
    }

    static void permutation(String p, String up, int index) {
        if (index >= up.length()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(index);
        for (int i = 0; i < p.length() + 1; i++) {
            String new_processed = p.substring(0, i) + ch + p.substring(i);
            permutation(new_processed, up, index + 1);
        }
    }

    static List<String> perm_list(String p, String up, int index) {
        if (index >= up.length()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(index);
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String new_processed = p.substring(0, i) + ch + p.substring(i);
            ans.addAll(perm_list(new_processed, up, index + 1));
        }
        return ans;
    }

    static int count_perm(String p, String up, int index) {
        if (index >= up.length()) {
            return 1;
        }
        int count = 0;
        char ch = up.charAt(index);
        for (int i = 0; i < p.length() + 1; i++) {
            String new_processed = p.substring(0, i) + ch + p.substring(i);
            count = count + count_perm(new_processed, up, index + 1);
        }
        return count;
    }
}
