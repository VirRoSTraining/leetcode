package solved;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main1091 {

    public static void main(String[] args) {

        int[][] grid1 = {{0, 1}, {1, 0}},
                grid2 = {{0, 0, 0}, {1, 1, 0}, {1, 1, 0}},
                grid3 = {{1, 0, 0}, {1, 1, 0}, {1, 1, 0}},
                grid4 = {{0, 1, 1, 0, 1}, {0, 1, 0, 1, 0}, {0, 1, 0, 1, 0}, {1, 0, 1, 1, 0}, {1, 1, 1, 1, 0}};

        System.out.println(shortestPathBinaryMatrix(grid1));
        System.out.println(shortestPathBinaryMatrix(grid2));
        System.out.println(shortestPathBinaryMatrix(grid3));
        System.out.println(shortestPathBinaryMatrix(grid4));
    }

    public static int shortestPathBinaryMatrix(int[][] grid) {
        if (grid[0][0] != 0 || grid[grid.length - 1][grid.length - 1] != 0) return -1;

        int lastIndex = grid.length - 1;
        int[][] moves = {{-1, -1}, {-1, 1}, {1, 1}, {1, -1}, {0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{0, 0, 1});

        while (queue.size() > 0) {
            int[] curr = queue.poll();

            if (curr[0] == lastIndex && curr[1] == lastIndex) return curr[2];
            grid[curr[0]][curr[1]] = -1;

            for (int[] move : moves) {
                int x = curr[0] + move[0];
                int y = curr[1] + move[1];

                if (x >= 0 && x <= lastIndex && y >= 0 && y <= lastIndex && grid[x][y] == 0) {
                    queue.offer(new int[]{x, y, curr[2] + 1});
                }
            }
        }
        return -1;
    }
//    public static int shortestPathBinaryMatrix(int[][] grid) {
//        if (grid[0][0] == 1) return -1;
//
//        var moves = new int[][] {{-1,-1}, {-1,0}, {-1,1}, {0,-1}, {0,1}, {1,-1}, {1,0}, {1,1}};
//        var n = grid.length;
//        var seen = new boolean[n][n];
//        var queue = new ArrayDeque<int[]>();
//        queue.offer(new int[] {0, 0});
//
//        for (var cnt = 1; !queue.isEmpty(); cnt++) {
//            for (var i = queue.size(); i > 0; i--) {
//                var cell = queue.poll();
//
//                if (cell[0] == n-1 && cell[1] == n-1)
//                    return cnt;
//
//                for (var move : moves) {
//                    var x = cell[0] + move[0];
//                    var y = cell[1] + move[1];
//
//                    if (x >= 0 && x < n && y >= 0 && y < n && !seen[x][y] && grid[x][y] == 0) {
//                        seen[x][y] = true;
//                        queue.offer(new int[] {x, y});
//                    }
//                }
//            }
//        }
//        return -1;
//    }
}
