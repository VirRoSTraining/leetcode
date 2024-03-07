package solved;

import java.util.Collections;
import java.util.PriorityQueue;

public class Main1046 {

    public static void main(String[] args) {

        int[] arr = new int[]{2, 7, 4, 1, 8, 1};

        System.out.println(lastStoneWeight(arr));
    }

    public static int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int stone : stones) {
            queue.offer(stone);
        }

        while (queue.size() > 1) {
            int stone1 = queue.poll();
            int stone2 = queue.poll();

            if (stone1 > stone2) queue.offer(stone1 - stone2);
        }

        return queue.isEmpty() ? 0 : queue.poll();
    }
}
