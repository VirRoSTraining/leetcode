package solved;

import java.util.Arrays;

public class Main1317 {

    public static void main(String[] args) {
        int t1 = 2, t2 = 11, t3 = 102;

        System.out.println(Arrays.toString(getNoZeroIntegers(t1)));
        System.out.println(Arrays.toString(getNoZeroIntegers(t2)));
        System.out.println(Arrays.toString(getNoZeroIntegers(t3)));
    }

    public static int[] getNoZeroIntegers(int n) {

        int n1 = 1, n2 = n - n1;
        while (n1 < n) {
            if (checkNumber(n1) && checkNumber(n2)) break;
            n1++;
            n2--;
        }

        return new int[]{n1, n2};
    }

    public static boolean checkNumber(int n) {
        if (n == 0) return false;
        if (n < 10) return true;
        if (n % 10 == 0) return false;
        return checkNumber(n / 10);
    }
}
