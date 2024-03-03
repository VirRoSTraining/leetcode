package solved;

import special.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main94 {
    public static void main(String[] args) {

        TreeNode l2 = new TreeNode(3);
        TreeNode r1 = new TreeNode(2, l2, null);
        TreeNode root = new TreeNode(1, null, r1);

        System.out.println(inorderTraversal(root));
    }

//    public static List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> values = new ArrayList<>();
//        addNodeValueToList(root, values);
//        return values;
//    }
//
//    public static void addNodeValueToList(TreeNode root, List<Integer> values) {
//        if (root.left != null) addNodeValueToList(root.left, values);
//        values.add(root.val);
//        if (root.right != null) addNodeValueToList(root.right, values);
//    }

    public static List<Integer> inorderTraversal(TreeNode root) {

        TreeNode x = root;
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> values = new ArrayList<>();

        while (x != null || !stack.isEmpty()){
            while (x != null) {
                stack.push(x);
                x = x.left;
            }
            x = stack.pop();
            values.add(x.val);
            x = x.right;
        }

        return values;
    }
}
