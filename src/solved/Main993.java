package solved;

import special.TreeNode;

public class Main993 {

    public static void main(String[] args) {

        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t2 = new TreeNode(2, null, t4);
        TreeNode t3 = new TreeNode(3, null, t5);
        TreeNode t1 = new TreeNode(1, t2, t3);

        System.out.println(isCousins(t1, 2, 3));
    }

    public static boolean isCousins(TreeNode root, int x, int y) {
        int[] depths = new int[101];
        jump(root.left, x, y, depths, 1, root);
        jump(root.right, x, y, depths, 1, root);
        return depths[x] > 0 && depths[y] > 0 && depths[x] == depths[y];
    }

    public static void jump(TreeNode node, int x, int y, int[] depths, int depth, TreeNode parent) {
        if (node == null) return;

        int val = node.val;
        if (x == val) {
            if (parent != null && (
                    (parent.left != null && parent.left.val == y) || ((parent.right != null && parent.right.val == y))
            )) return;
            depths[x] = depth;
            if (depths[y] > 0) return;
        }
        if (y == val) {
            if (parent != null && (
                    (parent.left != null && parent.left.val == x) || ((parent.right != null && parent.right.val == x))
            )) return;
            depths[y] = depth;
            if (depths[x] > 0) return;
        }

        jump(node.left, x, y, depths, depth + 1, node);
        jump(node.right, x, y, depths, depth + 1, node);
    }
}
