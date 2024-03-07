package solved;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Main1054 {

    public static void main(String[] args) {

        int[] arr1 = {1, 1, 1, 2, 2, 2}, arr2 = {1, 1, 1, 1, 2, 2, 3, 3};

        System.out.println(Arrays.toString(rearrangeBarcodes(arr1)));
        System.out.println(Arrays.toString(rearrangeBarcodes(arr2)));

    }

    public static int[] rearrangeBarcodes(int[] barcodes) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int br : barcodes) {
            map.merge(br, 1, Integer::sum);
        }

        PriorityQueue<Bar> pq = new PriorityQueue<>(
                (a, b) -> b.count - a.count
        );

        map.forEach((k, v) -> pq.offer(new Bar(k, v)));

        int[] result = new int[barcodes.length];
        Bar prev = null;

        for (int i = 0; i < result.length; i++) {
            Bar current = pq.poll();
            result[i] = current.barcode;
            current.count--;

            if (prev != null) {
                pq.offer(prev);
                prev = null;
            }
            if (current.count > 0) {
                prev = current;
            }
        }

        return result;
    }

    static class Bar {
        public int barcode;
        public int count;

        public Bar(int barcode, int count) {
            this.barcode = barcode;
            this.count = count;
        }
    }
}
