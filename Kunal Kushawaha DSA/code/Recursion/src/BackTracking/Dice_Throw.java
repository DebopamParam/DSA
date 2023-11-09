package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Dice_Throw {
    public static void main(String[] args) {
//        dice("", 4);
        System.out.println(dice_list("", 15).size());
    }

    static void dice(String p, int target) {
        if (target == 0) {
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p + i, target - i);
        }
    }

    static List<String> dice_list(String p, int target) {
        if (target == 0) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> ans = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            ans.addAll(dice_list(p + i, target - i));
        }
        return ans;
    }

}
