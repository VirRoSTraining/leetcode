package solved;

import java.util.Arrays;

public class Main948 {

    public static void main(String[] args) {

        int[] arr1 = {100}, arr2 = {200, 100}, arr3 = {100, 200, 300, 400};
        int power1 = 50, power2 = 150, power3 = 200;

        System.out.println(bagOfTokensScore(arr1, power1));
        System.out.println(bagOfTokensScore(arr2, power2));
        System.out.println(bagOfTokensScore(arr3, power3));
    }

    public static int bagOfTokensScore(int[] tokens, int power) {

        int[] sorted_token = tokens;
        Arrays.sort(sorted_token);
        int score = 0, current_power = power;

        for (int i = 0, j = sorted_token.length - 1; i <= j; ) {
            if (sorted_token[i] <= current_power) {
                current_power = current_power - sorted_token[i];
                i++;
                score++;
                continue;
            }

            if (score > 0 && j - i > 1) {
                current_power = current_power + sorted_token[j];
                j--;
                score--;
                continue;
            }

            break;
        }

        return score;
    }
}
