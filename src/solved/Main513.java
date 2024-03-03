package solved;

import special.TreeNode;

public class Main513 {
    public static void main(String[] args) {

        TreeNode t7 = new TreeNode(7);
        TreeNode t6 = new TreeNode(6);
        TreeNode t5 = new TreeNode(5, t7, null);
        TreeNode t4 = new TreeNode(4);
        TreeNode t3 = new TreeNode(3, t5, t6);
        TreeNode t2 = new TreeNode(2, t4, null);
        TreeNode t1 = new TreeNode(1, t2, t3);

        System.out.println(findBottomLeftValue(t1));
    }

    public static int findBottomLeftValue(TreeNode root) {
        return jump(root, new LeftNodeInfo(0, root.val)).value;
    }

    public static LeftNodeInfo jump(TreeNode node, LeftNodeInfo info) {
        if (node == null) return info;

        LeftNodeInfo left = jump(node.left, new LeftNodeInfo(info.count + 1, node.val));
        LeftNodeInfo right = jump(node.right, new LeftNodeInfo(info.count + 1, node.val));

        return right.count > left.count ? right : left;
    }

    static class LeftNodeInfo {
        public int count;
        public int value;

        public LeftNodeInfo(int count, int value) {
            this.count = count;
            this.value = value;
        }
    }
}
