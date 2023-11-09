package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }

    public static List<String> letterCombinations(String digits) {

        List<String> list = new ArrayList<String>();
        if (digits.isEmpty()) {
            return list;
        }
        String[] phone_map = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        backtrack("",digits,phone_map,list);

        return list;
    }

    private static void backtrack(String p, String next_digit, String[] phoneMap, List<String> list) {
        if(next_digit.isEmpty())
        {
            list.add(p);
            return;
        }
        int index = next_digit.charAt(0) - '2'; // Index of current un-processed

        String letters = phoneMap[index];

        for(char letter : letters.toCharArray())
        {
            backtrack(p+letter , next_digit.substring(1),phoneMap,list);
        }
    }
}
