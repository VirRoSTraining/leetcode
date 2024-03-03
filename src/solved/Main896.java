package solved;

public class Main896 {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 2, 3};
        int[] arr2 = {6, 5, 4, 4};
        int[] arr3 = {1, 3, 2};

        System.out.println(isMonotonic(arr1));
        System.out.println(isMonotonic(arr2));
        System.out.println(isMonotonic(arr3));
    }

    public static boolean isMonotonic(int[] nums) {

        if (nums[0] > nums[nums.length - 1]) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == nums[i + 1] || nums[i] > nums[i + 1]) continue;
                return false;
            }
        } else {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == nums[i + 1] || nums[i] < nums[i + 1]) continue;
                return false;
            }
        }

        return true;
    }
}
