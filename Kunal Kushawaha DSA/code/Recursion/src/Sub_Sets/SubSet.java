package Sub_Sets;

import java.util.ArrayList;

public class SubSet {
    public static void main(String[] args) {
        String s = "abc";
        subSeq(s, "", 0);
        System.out.println(subseqList("", "abc", 0));
    }

    static void subSeq(String up, String p, int index) {
        if (index >= up.length()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(index);
        subSeq(up, p + ch, index + 1);
        subSeq(up, p, index + 1);
    }

    static ArrayList<String> subseqList(String p, String up, int index) {
        if (index >= up.length()) {
            ArrayList<String> list = new ArrayList<>();
            if (!p.isEmpty()) {
                list.add(p);
            }
            return list;
        }
        char ch = up.charAt(index);
        ArrayList<String> left = subseqList(p + ch, up, index + 1);
        ArrayList<String> right = subseqList(p, up, index + 1);
        left.addAll(right);
        return left;
    }


}
