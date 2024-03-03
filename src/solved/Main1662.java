package solved;

public class Main1662 {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c", "d"};
        String[] word2 = {"a", "bcd"};

        System.out.println(arrayStringsAreEqual(word1, word2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return String.join("", word1).equals(String.join("", word2));
    }
}
