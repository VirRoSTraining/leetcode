package solved;

public class Main1013 {
    public static void main(String[] args) {

        int[] arr1 = {0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1};
        int[] arr2 = {0, 2, 1, -6, 6, 7, 9, -1, 2, 0, 1};
        int[] arr3 = {3, 3, 6, 5, -2, 2, 5, 1, -9, 4};

        System.out.println(canThreePartsEqualSum(arr1));
        System.out.println(canThreePartsEqualSum(arr2));
        System.out.println(canThreePartsEqualSum(arr3));
    }

//    public static boolean canThreePartsEqualSum(int[] arr) {
//
//        int e1 = 0, s2, e2, sum1 = 0;
//
//        while (e1 < arr.length - 2) {
//            sum1 = sum1 + arr[e1];
//
//            s2 = e1 + 1;
//            int t2 = getEndIndexBySum(arr, s2, arr.length - 2, sum1);
//            if (t2 == -1) {
//                e1++;
//                continue;
//            }
//            e2 = t2;
//
//            if (sum1 == sumForArr(arr, e2 + 1, arr.length - 1)) return true;
//            e1++;
//        }
//
//        return false;
//    }
//
//    public static int getEndIndexBySum(int[] arr, int startIndex, int endIndex, int sum) {
//        int ei = startIndex;
//        int timeSum = 0;
//
//        while (ei <= endIndex) {
//            timeSum = timeSum + arr[ei];
//            if (timeSum == sum) return ei;
//            ei++;
//        }
//        return -1;
//    }
//
//    public static int sumForArr(int[] arr, int startIndex, int endIndex) {
//        int sum = 0;
//        for (int i = startIndex; i <= endIndex; i++) {
//            sum = sum + arr[i];
//        }
//        return sum;
//    }

    public static boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        if (sum % 3 != 0) return false;

        int avg = sum / 3, count = 0, temp = 0;
        for (int j : arr) {
            temp = temp + j;
            if (temp == avg) {
                count++;
                temp = 0;
            }
        }

        return (count >= 3);
    }
}
