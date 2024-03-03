package solved;

import special.TreeNode;

public class Main100 {
    public static void main(String[] args) {

        TreeNode l1 = new TreeNode(2);
        TreeNode r1 = new TreeNode(3);
        TreeNode f = new TreeNode(1, l1, r1);
        TreeNode l2 = new TreeNode(2);
        TreeNode r2 = new TreeNode(3);
        TreeNode s = new TreeNode(1, l2, r2);

        System.out.println(isSameTree(f, s));
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;

        if (p.val != q.val) return false;
        if (!isSameTree(q.left, p.left)) return false;
        if (!isSameTree(q.right, p.right)) return false;

        return true;
    }
}
