package solved;

import java.util.Arrays;

public class Main977 {

    public static void main(String[] args) {

        int[] arr1 = {-4, -1, 0, 3, 10};
        int[] arr2 = {-7, -3, 2, 3, 11};

        System.out.println(Arrays.toString(sortedSquares(arr1)));
        System.out.println(Arrays.toString(sortedSquares(arr2)));
    }


    public static int[] sortedSquares(int[] nums) {

        int[] result = new int[nums.length];

        int start = 0, end = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {

            int s = nums[start] * nums[start], e = nums[end] * nums[end];
            if (e > s) {
                result[i] = e;
                end--;
            } else {
                result[i] = s;
                start++;
            }
        }

        return result;
    }
}
