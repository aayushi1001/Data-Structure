package DataStructure.BinaryTree.Medium;

import DataStructure.BinaryTree.utils.TreeNode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class CheckIfTreeIsBalanced {
    public static boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        Stack<TreeNode> stack = new Stack<>();
        Map<TreeNode, Integer> height = new HashMap<>();
        TreeNode curr = root;
        TreeNode lastVisited = null;

        while (!stack.isEmpty() || curr != null) {
            if (curr != null) {
                stack.push(curr);
                curr = curr.left;
            } else {
                TreeNode peek = stack.peek();

                if (peek.right != null && lastVisited != peek.right) {
                    curr = peek.right;
                } else {
                    stack.pop();

                    int leftHeight = height.getOrDefault(peek.left, 0);
                    int rightHeight = height.getOrDefault(peek.right, 0);

                    if (Math.abs(leftHeight - rightHeight) > 1) {
                        return false;
                    }

                    height.put(peek, Math.max(leftHeight, rightHeight) + 1);

                    lastVisited = peek;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(isBalanced(TreeNode.createTree()));
    }
}
