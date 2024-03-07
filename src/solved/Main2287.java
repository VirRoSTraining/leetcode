package solved;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.HashMap;
import java.util.Map;

public class Main2287 {

    public static void main(String[] args) {

        String s1 = "ilovecodingonleetcode", target1 = "code",
                s2 = "abcba", target2 = "abc",
                s3 = "abbaccaddaeea", target3 = "aaaaa";

        System.out.println(rearrangeCharacters(s1, target1));
        System.out.println(rearrangeCharacters(s2, target2));
        System.out.println(rearrangeCharacters(s3, target3));
    }

    public static int rearrangeCharacters(String s, String target) {

        Map<Character, Integer> symbols = new HashMap<>();

        char[] arrs = s.toCharArray();
        for (char arr : arrs) {
            if (target.contains(String.valueOf(arr))) {
                symbols.merge(arr, 1, Integer::sum);
            }
        }

        int count = 0;
        boolean flag = true;
        while (flag) {

            for (char c : target.toCharArray()) {
                if (symbols.get(c) == null || symbols.get(c) < 1) {
                    flag = false;
                    break;
                }
                symbols.put(c, symbols.get(c) - 1);
            }
            if (!flag) break;
            count++;
        }

        return count;
    }
}
