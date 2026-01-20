package DataStructure.BinaryTree.Medium;

import DataStructure.BinaryTree.utils.TreeNode;

public class RecursiveMaxPathSum {
     static int max = Integer.MIN_VALUE;

    public static int maxPathUtil(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int leftSum = maxPathUtil(root.left);
        int rightSum = maxPathUtil(root.right);

        int currMax = Math.max(leftSum + root.val, rightSum + root.val);
        currMax = Math.max(currMax, root.val);
        max = Math.max(max, currMax);
        max = Math.max(max, leftSum + root.val + rightSum);

        return currMax;
    }

    public static int maxPathSum(TreeNode root) {
        max = Integer.MIN_VALUE;
        maxPathUtil(root);
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxPathSum(TreeNode.createTree()));
    }
}
