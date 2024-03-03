package solved;

public class Main25 {
    public static void main(String[] args) {

        int test = 29561;
        int test2 = 38;
        System.out.println(addDigits(test)); //5
        System.out.println(addDigits(test2)); //2
    }

//    public static int addDigits(int num) {
//
//        int number = num;
//        int result = 0;
//
//        while (number > 0) {
//            int time_result = (number % 10 + result);
//            result = time_result > 9 ? time_result % 10 + time_result / 10 : time_result;
//            number = number / 10;
//        }
//
//        return result;
//    }

    public static int addDigits(int num) {
        if (num == 0) return 0;
        int q = num % 9;
        return  (q == 0) ? 9 : q;
    }
}
