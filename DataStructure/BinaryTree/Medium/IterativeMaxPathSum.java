package DataStructure.BinaryTree.Medium;

import DataStructure.BinaryTree.utils.TreeNode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class IterativeMaxPathSum {
    public static int maxPathSum(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        Map<TreeNode, Integer> height = new HashMap<>();
        TreeNode curr = root;
        TreeNode lastVisited = null;
        int max = Integer.MIN_VALUE;

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

                    int leftSum = height.getOrDefault(peek.left, 0);
                    int rightSum = height.getOrDefault(peek.right, 0);

                    int currSum = Math.max(leftSum + peek.val, rightSum + peek.val);
                    currSum = Math.max(currSum, peek.val);
                    max = Math.max(max, Math.max(currSum, leftSum + rightSum + peek.val));
                    height.put(peek, currSum);

                    lastVisited = peek;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxPathSum(TreeNode.createTree()));
    }
}
