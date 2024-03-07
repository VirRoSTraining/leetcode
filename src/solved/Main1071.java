package solved;

public class Main1071 {

    public static void main(String[] args) {
        String str1 = "ABCABC", str2 = "ABC",
                str11 = "ABAB", str12 = "ABABAB",
                str21 = "LEET", str22 = "CODE";

        System.out.println(gcdOfStrings(str1, str2));
        System.out.println(gcdOfStrings(str11, str12));
        System.out.println(gcdOfStrings(str21, str22));
    }

    public static String gcdOfStrings(String str1, String str2) {

        if (!(str1 + str2).equals(str2 + str1)) return "";

        int gcdval = gcd(str1.length(), str2.length());
        return str2.substring(0, gcdval);
    }

    static int gcd(int x, int y) {
        if (y == 0) return x;
        else return gcd(y, x % y);
    }
}
