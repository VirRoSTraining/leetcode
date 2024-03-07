package solved;

public class Main1750 {

    public static void main(String[] args) {

        String s1 = "ca", s2 = "cabaabac", s3 = "aabccabba";

        System.out.println(minimumLength(s1));
        System.out.println(minimumLength(s2));
        System.out.println(minimumLength(s3));
    }

    public static int minimumLength(String s) {

        char[] arr = s.toCharArray();

        int left = 0, right = arr.length - 1;

        while (left < right) {

            char c = arr[left];

            if (arr[right] != c) break;

            int i = left + 1, j = right - 1;

            while (i < right) {
                if (arr[i] != c) break;
                i++;
            }
            left = i;

            while (j > left) {
                if (arr[j] != c) break;
                j--;
            }
            right = j;
        }
        return right >= left ? right - left + 1 : 0;
    }
}
