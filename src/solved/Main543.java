package solved;

import special.TreeNode;

public class Main543 {

    public static void main(String[] args) {

        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t2 = new TreeNode(2, t4, t5);
        TreeNode t3 = new TreeNode(3);
        TreeNode t1 = new TreeNode(1, t2, t3);

        System.out.println(diameterOfBinaryTree(t1));
    }

    public static int diameterOfBinaryTree(TreeNode root) {
        return getInfoForWay(root).diameter;
    }

    public static DataInfo getInfoForWay(TreeNode node) {

        if (node == null) return new DataInfo(0, 0);

        DataInfo wayLeft = getInfoForWay(node.left);
        DataInfo wayRight = getInfoForWay(node.right);

        int diameter = wayLeft.length + wayRight.length;

        return new DataInfo(Math.max(
                diameter, Math.max(wayLeft.diameter, wayRight.diameter)),
                Math.max(wayLeft.length, wayRight.length) + 1);
    }

    static class DataInfo {
        public int diameter;
        public int length;

        public DataInfo(int diameter, int length) {
            this.diameter = diameter;
            this.length = length;
        }
    }
}
