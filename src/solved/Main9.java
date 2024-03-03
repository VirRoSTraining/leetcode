package solved;

public class Main9 {

    public static void main(String[] args) {

        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(0));
        System.out.println(isPalindrome(10));
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(1231));
        System.out.println(isPalindrome(1551));

    }

    public static boolean isPalindrome(int x) {
        if (-1 < x && x < 10) return true;
        if (x < 0 || x % 10 == 0) return false;

        int number = x;
        int invert = 0;
        while (number != 0) {
            if (number == invert) return true;
            int num = number % 10;
            int newNumber = number / 10;
            if (newNumber == invert) return true;
            number = newNumber;
            invert = invert * 10 + num;
        }

        return false;
    }
}


