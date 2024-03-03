package solved;

public class Main58 {
    public static void main(String[] args) {

        String test1 = "Hello World";
        String test2 = "   fly me   to   the moon  ";
        String test3 = "luffy is still joyboy";

        System.out.println(lengthOfLastWord(test1));
        System.out.println(lengthOfLastWord(test2));
        System.out.println(lengthOfLastWord(test3));
    }

    public static int lengthOfLastWord(String s) {

        char[] arr = s.toCharArray();

        int count = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == ' ') {
                if (count > 0) return count;
                continue;
            }
            count++;
        }

        return count;
    }
}
