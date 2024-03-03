package solved;

import special.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Main872 {

    public static void main(String[] args) {

        TreeNode t6 = new TreeNode(6);
        TreeNode t7 = new TreeNode(7);
        TreeNode t4 = new TreeNode(4);
        TreeNode t9 = new TreeNode(9);
        TreeNode t8 = new TreeNode(8);
        TreeNode t2 = new TreeNode(2, t7, t4);
        TreeNode t5 = new TreeNode(5, t6, t2);
        TreeNode t1 = new TreeNode(1, t9, t8);
        TreeNode t3 = new TreeNode(3, t5, t1);

        TreeNode r6 = new TreeNode(6);
        TreeNode r7 = new TreeNode(7);
        TreeNode r4 = new TreeNode(4);
        TreeNode r9 = new TreeNode(9);
        TreeNode r8 = new TreeNode(8);
        TreeNode r2 = new TreeNode(2, r9, r8);
        TreeNode r5 = new TreeNode(5, r6, r7);
        TreeNode r1 = new TreeNode(1, r4, r2);
        TreeNode r3 = new TreeNode(3, r5, r1);

        System.out.println(leafSimilar(t3, r3));
    }

    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {

        List<Integer> tQueue = new ArrayList<>();
        List<Integer> rQueue = new ArrayList<>();

        fillTree(tQueue, root1);
        fillTree(rQueue, root2);

        if (tQueue.size() != rQueue.size()) return false;
        for (int i = 0; i < tQueue.size(); i++) {
            if (!tQueue.get(i).equals(rQueue.get(i))) return false;
        }

        return true;
    }

    public static void fillTree(List<Integer> queue, TreeNode node) {
        if (node == null) return;
        if (node.left == null && node.right == null) {
            queue.add(node.val);
            return;
        }

        fillTree(queue, node.left);
        fillTree(queue, node.right);
    }
}
