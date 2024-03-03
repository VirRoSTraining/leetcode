package solved;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main859 {

    public static void main(String[] args) {

        String s1 = "ab";
        String g1 = "ba";
        String s2 = "ab";
        String g2 = "ab";
        String s3 = "aa";
        String g3 = "aa";

        System.out.println(buddyStrings(s1, g1));
        System.out.println(buddyStrings(s2, g2));
        System.out.println(buddyStrings(s3, g3));
    }

    public static boolean buddyStrings(String s, String goal) {
        if(s.length() != goal.length()) return false;

        if (s.equals(goal)) {
            Set<Character> symbols = new HashSet<>();
            for (char i : s.toCharArray()) {
                if (symbols.contains(i)) return true;
                symbols.add(i);
            }
            return false;
        }

        int errors = 0;
        char s1 = 0, g1 = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                if (errors == 2) return false;
                if (errors == 1) {
                    if (s.charAt(i) != g1 || goal.charAt(i) != s1) return false;
                }
                if (errors == 0) {
                    s1 = s.charAt(i);
                    g1 = goal.charAt(i);
                }
                errors++;
            }
        }
        return errors == 2;
    }
}
