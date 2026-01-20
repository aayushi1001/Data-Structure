package DataStructure.BinaryTree.Medium;

import DataStructure.BinaryTree.utils.TreeNode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class IterativeDiameter {
    public static int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Stack<TreeNode> stack = new Stack<>();
        Map<TreeNode, Integer> height = new HashMap<>();
        TreeNode curr = root;
        TreeNode lastVisited = null;
        int diameter = 0;

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

                    if (leftHeight + rightHeight > diameter) {
                        diameter = leftHeight + rightHeight;
                    }

                    height.put(peek, Math.max(leftHeight, rightHeight) + 1);

                    lastVisited = peek;
                }
            }
        }

        return diameter;
    }

    public static void main(String[] args) {
        System.out.println(diameterOfBinaryTree(TreeNode.createTree()));
    }
}
