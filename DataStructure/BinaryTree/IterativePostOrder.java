package DataStructure.BinaryTree;

import DataStructure.BinaryTree.utils.TreeNode;

import java.util.*;

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

    public static List<Integer> postorder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        TreeNode lastVisited = null;

        while (!stack.isEmpty() || curr != null) {
            if (curr != null) {
                stack.push(curr);
                curr = curr.left;
            } else {
                TreeNode top = stack.peek();

                if (top.right != null && lastVisited != top.right) {
                    curr = top.right;
                } else {
                    result.add(top.val);
                    stack.pop();
                    lastVisited = top;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(postorderTraversal(TreeNode.createTree()));
    }
}
