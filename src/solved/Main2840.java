package solved;

import java.util.HashMap;
import java.util.Map;

public class Main2840 {

    public static void main(String[] args) {

        String tf1 = "abcdba";
        String ts1 = "cabdab";
        String tf2 = "abe";
        String ts2 = "bea";

        System.out.println(checkStrings(tf1, ts1));
        System.out.println(checkStrings(tf2, ts2));
    }

    public static boolean checkStrings(String s1, String s2) {

        Map<String, Integer> evenS1 = new HashMap<>();
        Map<String, Integer> notEvenS1 = new HashMap<>();
        Map<String, Integer> evenS2 = new HashMap<>();
        Map<String, Integer> notEvenS2 = new HashMap<>();

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        for (int i = 0; i < arr1.length; i++) {
            if (i % 2 == 0) {
                addSymbolToMap(evenS1, String.valueOf(arr1[i]));
                addSymbolToMap(evenS2, String.valueOf(arr2[i]));
            } else {
                addSymbolToMap(notEvenS1, String.valueOf(arr1[i]));
                addSymbolToMap(notEvenS2, String.valueOf(arr2[i]));
            }
        }

        return evenS1.equals(evenS2) && notEvenS1.equals(notEvenS2);
    }

    public static void addSymbolToMap(Map<String, Integer> symbolsMap, String symbol) {
        symbolsMap.merge(symbol, 1, Integer::sum);
    }
}
