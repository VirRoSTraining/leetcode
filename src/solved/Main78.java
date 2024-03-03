package solved;

import java.util.ArrayList;
import java.util.List;

public class Main78 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        System.out.println(subsets(arr));
    }

    public static List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> results = new ArrayList<>();
        results.add(new ArrayList<>());

        for (int i : nums) {
            List<List<Integer>> tempLists = new ArrayList<>();
            for (List<Integer> l : results) {
                List<Integer> tempList = new ArrayList<>(l);
                tempList.add(i);
                tempLists.add(tempList);
            }
            results.addAll(tempLists);
        }
        return results;
    }
}
