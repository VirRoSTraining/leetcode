package solved;

import java.util.Arrays;

public class Main2523 {

    public static void main(String[] args) {

        int l1 = 10, r1 = 19, l2 = 4, r2 = 6, l3 = 19, r3 = 31;

        System.out.println(Arrays.toString(closestPrimes(l1, r1)));
        System.out.println(Arrays.toString(closestPrimes(l2, r2)));
        System.out.println(Arrays.toString(closestPrimes(l3, r3)));
    }

    public static int[] closestPrimes(int left, int right) {
        int num1 = 0, num2 = 0, last = 0;
        boolean[] noPrimes = getNotPrimeNumbers(right + 1);

        for (int i = left; i <= right; i++) {
            if (!noPrimes[i]) {
                if (num1 == 0) {
                    num1 = num2;
                    num2 = i;
                    last = i;
                    continue;
                }
                if ((num2 - num1) > (i - last)) {
                    num1 = last;
                    num2 = i;
                }
                last = i;
            }
        }

        return (num1 == 0) ? new int[]{-1, -1} : new int[]{num1, num2};
    }

    public static boolean[] getNotPrimeNumbers(int size) {
        boolean[] sieve = new boolean[size];
        sieve[0] = true;
        sieve[1] = true;

        for (int i = 2; i < sieve.length; i++) {
            if (!sieve[i]) {
                for (int j = 2; i * j < sieve.length; j++) {
                    sieve[i * j] = true;
                }
            }
        }
        return sieve;
    }
}