package DataStructure.BinaryTree;

import DataStructure.BinaryTree.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterativePostOrder {
    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        while (root != null || !st.isEmpty()) {
            while (root != null) {
                st.push(root);
                st.push(root);
                root = root.left;
            }
            root = st.pop();
            if (!st.isEmpty() && st.peek() == root) {
                root = root.right;
            } else {
                res.add(root.val);
                root = null;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(postorderTraversal(TreeNode.createTree()));
    }
}
