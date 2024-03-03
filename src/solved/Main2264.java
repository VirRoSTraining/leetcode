package solved;

public class Main2264 {

    public static void main(String[] args) {
        String test1 = "6777133339";
        String test2 = "2300019";
        String test3 = "42352338";

        System.out.println(largestGoodInteger(test1));
        System.out.println(largestGoodInteger(test2));
        System.out.println(largestGoodInteger(test3));
    }

    public static String largestGoodInteger(String num) {

        char[] arr = num.toCharArray();

        int n = 47;

        for (int i = 2; i < arr.length; i++) {
            if (arr[i - 2] == arr[i - 1] && arr[i - 1] == arr[i]) {
                if (arr[i] > n) n = arr[i];
            }
        }

        return n >= 48 ? String.valueOf(new char[]{(char) n, (char) n, (char) n}) : "";
    }
}
