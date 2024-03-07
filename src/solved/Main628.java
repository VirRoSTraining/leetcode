package solved;

import java.util.Arrays;

public class Main628 {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3}, nums2 = {1, 2, 3, 4}, nums3 = {-1, -2, -3};

        System.out.println(maximumProduct(nums1));
        System.out.println(maximumProduct(nums2));
        System.out.println(maximumProduct(nums3));
    }

    public static int maximumProduct(int[] nums) {

        Arrays.sort(nums);

        int max = nums[nums.length - 1];
        return Math.max(
                (max * nums[nums.length - 2] * nums[nums.length - 3]),
                (max * nums[0] * nums[1])
        );
    }
}
