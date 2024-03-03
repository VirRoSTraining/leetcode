package solved;

public class Main55 {

    public static void main(String[] args) {

        int[] arr1 = {2, 3, 1, 1, 4};
        int[] arr2 = {3, 2, 1, 0, 4};

        System.out.println(canJump(arr1));
        System.out.println(canJump(arr2));
    }

    public static boolean canJump(int[] nums) {

        int index = nums.length - 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (i + nums[i] >= index) {
                index = i;
            }
        }

        return index == 0;
    }
}
