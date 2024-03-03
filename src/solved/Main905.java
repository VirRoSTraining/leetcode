package solved;

import java.util.Arrays;

public class Main905 {
    public static void main(String[] args) {

        int[] arr = {3, 1, 2, 4};

        System.out.println(Arrays.toString(sortArrayByParity(arr)));

    }

    public static int[] sortArrayByParity(int[] nums) {

        int[] newNums = nums;

        int i1 = 0, i2 = nums.length - 1, temp1 = -1, temp2 = -1;

        while (i1 < i2) {
            if (nums[i1] % 2 == 1) {
                temp1 = i1;
            }
            if (nums[i2] % 2 == 0) {
                temp2 = i2;
            }

            if (temp1 > -1 && temp2 > -1) {
                swapIndex(newNums, temp1, temp2);
                temp1 = -1;
                temp2 = -1;
            }

            if (temp1 == -1) i1++;
            if (temp2 == -1) i2--;
        }
        return newNums;
    }

    public static void swapIndex(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
