package solved;

import java.util.Arrays;

public class Main2864 {

    public static void main(String[] args) {
        String test1 = "010";
        String test2 = "0101";
        String test3 = "0011010";

        System.out.println(maximumOddBinaryNumber(test1));
        System.out.println(maximumOddBinaryNumber(test2));
        System.out.println(maximumOddBinaryNumber(test3));
    }

    public static String maximumOddBinaryNumber(String s) {

        int countOnes = 0;
        StringBuilder resultBuilder = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch == '1') {
                countOnes++;
            }
        }

        for (int i = 0; i < s.length() - 1; i++) {
            if (countOnes > 1) {
                countOnes--;
                resultBuilder.append('1');
            } else {
                resultBuilder.append('0');
            }
        }

        resultBuilder.append('1');
        return resultBuilder.toString();
    }

//    public static String maximumOddBinaryNumber(String s) {
//
//        int count = (int) s.chars().filter(symbol -> symbol == '1').count();
//
//        StringBuilder result = new StringBuilder();
//        for (int i = 0; i < count - 1; i++) {
//            result.append("1");
//        }
//        for (int j = 0; j < s.length() - count; j++) {
//            result.append("0");
//        }
//        result.append("1");
//
//        return result.toString();
//    }
}
