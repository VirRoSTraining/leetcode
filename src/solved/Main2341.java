package solved;

import java.util.Arrays;

public class Main2341 {

    public static void main(String[] args) {
        int[] nums = {1,3,2,1,3,2,2};

        System.out.println(Arrays.toString(numberOfPairs(nums)));
    }

    public static int[] numberOfPairs(int[] nums) {
        int pairs = 0, numbers = 0;
        int[] counts = new int[101];

        for (int num : nums) {
            counts[num] = counts[num] + 1;
        }

        for (int count : counts) {
            if (count == 0) continue;
            pairs = pairs + (count / 2);
            numbers = numbers + (count % 2);
        }

        return new int[]{pairs, numbers};
    }
}
