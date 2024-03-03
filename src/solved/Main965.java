package solved;

import special.TreeNode;

public class Main965 {

    public static void main(String[] args) {

        TreeNode t4 = new TreeNode(1);
        TreeNode t5 = new TreeNode(1);
        TreeNode t6 = new TreeNode(1);
        TreeNode t2 = new TreeNode(1, t4, t5);
        TreeNode t3 = new TreeNode(1, t6, null);
        TreeNode t1 = new TreeNode(1, t2, t3);

        System.out.println(isUnivalTree(t1));
    }

    public static boolean isUnivalTree(TreeNode root) {
        return checkNode(root, root.val);
    }

    public static boolean checkNode(TreeNode node, int val) {
        if (node == null) return true;
        return checkNode(node.left, val) && checkNode(node.right, val) && node.val == val;
    }
}
