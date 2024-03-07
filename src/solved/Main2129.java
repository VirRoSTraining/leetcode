package solved;

public class Main2129 {

    public static void main(String[] args) {
        String title1 = "capiTalIze tHe titLe",
                title2 = "First leTTeR of EACH Word",
                title3 = "i lOve leetcode";

        System.out.println(capitalizeTitle(title1));
        System.out.println(capitalizeTitle(title2));
        System.out.println(capitalizeTitle(title3));
    }

    public static String capitalizeTitle(String title) {

        char[] arr = title.toCharArray();
        int start = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 32) {
                if (i - start > 2) {
                    arr[start] = (char) (arr[start] - 32);
                }
                start = i + 1;
                continue;
            }
            if (arr[i] < 91) {
                arr[i] = (char) (arr[i] + 32);
            }
        }

        if (arr.length - start > 2) {
            arr[start] = (char) (arr[start] - 32);
        }

        return String.valueOf(arr);
    }
}
