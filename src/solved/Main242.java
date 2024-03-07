package solved;

public class Main242 {

    public static void main(String[] args) {

        String s1 = "anagram", t1 = "nagaram",
                s2 = "rat", t2 = "car";

        System.out.println(isAnagram(s1, t1));
        System.out.println(isAnagram(s2, t2));

//        int a = 'a', z = 'z';
//        System.out.println("a = " + a + ", z = " + z);
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] arr = new int[26];

        for (char c : s.toCharArray()) {
            arr[c - 97] = arr[c - 97] + 1;
        }

        for (char c : t.toCharArray()) {
            if (arr[c - 97] < 1) return false;
            arr[c - 97] = arr[c - 97] - 1;
        }

        return true;
    }
}
