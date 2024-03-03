package solved;

public class Main908 {

    public static void main(String[] args) {

        int[] test1 = {0, 10}, test2 = {1, 3, 6};
        int k1 = 2, k2 = 3;

        System.out.println(smallestRangeI(test1, k1));
        System.out.println(smallestRangeI(test2, k2));
    }

//    public static int smallestRangeI(int[] nums, int k) {
//
//        int min = nums[0], max = nums[0];
//
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] < min) min = nums[i];
//            if (nums[i] > max) max = nums[i];
//        }
//
//        int avg = (min + max) / 2;
//        min = (k > avg - min) ? min + (avg - min) : min + k;
//        max = (k > max - avg) ? max - (max - avg) : max - k;
//
//        return max - min;
//    }

    public static int smallestRangeI(int[] nums, int k) {

        int min = nums[0], max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
        }

        max = max - k;
        min = min + k;

        return Math.max(max - min, 0);
    }
}
