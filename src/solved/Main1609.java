package solved;

import special.TreeNode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main1609 {

    public static void main(String[] args) {

        TreeNode t12 = new TreeNode(12);
        TreeNode t8 = new TreeNode(8);
        TreeNode t6 = new TreeNode(6);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3, t12, t8);
        TreeNode t7 = new TreeNode(7, t6, null);
        TreeNode t9 = new TreeNode(9, null, t2);
        TreeNode t10 = new TreeNode(10, t3, null);
        TreeNode t4 = new TreeNode(4, t7, t9);
        TreeNode t1 = new TreeNode(1, t10, t4);

//        System.out.println(isEvenOddTree(t1));

        TreeNode r3 = new TreeNode(3);
        TreeNode r33 = new TreeNode(3);
        TreeNode r7 = new TreeNode(7);
        TreeNode r4 = new TreeNode(4, r3, r33);
        TreeNode r2 = new TreeNode(2, r7, null);
        TreeNode r5 = new TreeNode(5, r4, r2);

        System.out.println(isEvenOddTree(r5));
    }

    public static boolean isEvenOddTree(TreeNode root) {
        Map<Integer, Stack<Integer>> treeLevels = new HashMap<>();
        fillLevelsMap(treeLevels, root, 0);

        for (int i = 0; i < treeLevels.size(); i++) {
            Stack<Integer> stack = treeLevels.get(i);
            int value = 0;

            if (i % 2 == 0) {
                while (!stack.isEmpty()) {
                    int valueInNode = stack.pop();
                    if (valueInNode % 2 != 1)return false;
                    if (valueInNode >= value && value != 0) return false;
                    value = valueInNode;
                }
            } else {
                while (!stack.isEmpty()) {
                    int valueInNode = stack.pop();
                    if (valueInNode % 2 != 0)return false;
                    if (valueInNode <= value && value != 0) return false;
                    value = valueInNode;
                }
            }
        }

        return true;
    }

    public static void fillLevelsMap(Map<Integer, Stack<Integer>> levels, TreeNode node, Integer level) {
        if (node == null) return;

        addValueInLevel(levels, level, node.val);

        fillLevelsMap(levels, node.left, level + 1);
        fillLevelsMap(levels, node.right, level + 1);
    }

    public static void addValueInLevel(Map<Integer, Stack<Integer>> levels, Integer level, Integer value) {
        if (levels.get(level) != null) {
            levels.get(level).push(value);
        } else {
            Stack<Integer> stackV = new Stack<>();
            stackV.push(value);
            levels.put(level, stackV);
        }
    }
}
