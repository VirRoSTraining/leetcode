package solved;

import java.util.ArrayList;
import java.util.List;

public class Main228 {
    public static void main(String[] args) {

        int[] arr = {0, 2, 3, 4, 6, 8, 9};
        System.out.println(summaryRanges(arr));
    }

    public static List<String> summaryRanges(int[] nums) {

        List<String> results = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int startNum = nums[i];
            while (i + 1 < nums.length && nums[i] + 1 == nums[i + 1]) i++;

            if (startNum == nums[i]) {
                results.add(String.valueOf(nums[i]));
            } else {
                results.add(startNum + "->" + nums[i]);
            }
        }

        return results;
    }
}
