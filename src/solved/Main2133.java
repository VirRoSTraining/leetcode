package solved;

public class Main2133 {

    public static void main(String[] args) {

        int[][] arr1 = {{1, 2, 3}, {3, 1, 2}, {2, 3, 1}};
        int[][] arr2 = {{1, 1, 1}, {1, 2, 3}, {1, 2, 3}};

        System.out.println(checkValid(arr1));
        System.out.println(checkValid(arr2));

    }

    public static boolean checkValid(int[][] matrix) {

        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            int[] setG = new int[n];
            int[] setV = new int[n];
            for (int j = 0; j < n; j++) {
                int g = matrix[i][j] - 1;
                if (g < 0 || g >= n || setG[g] != 0) return false;
                setG[g] = 1;
                int v = matrix[j][i] - 1;
                if (v < 0 || v >= n || setV[v] != 0) return false;
                setV[v] = 1;
            }
        }

        return true;
    }
}
