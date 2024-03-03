package solved;

import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {

        int[] nums = {3,3};
        int target = 6;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {

        if (nums.length == 2) return new int[]{0, 1};

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) return new int[]{i, j};
            }
        }

        return new int[]{0, 1};
    }
}
