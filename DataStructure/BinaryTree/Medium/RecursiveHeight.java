package DataStructure.BinaryTree.Medium;

import DataStructure.BinaryTree.utils.TreeNode;

public class RecursiveHeight {
    public static int height(TreeNode root) {
        if(root == null) {
            return 0;
        }

        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static void main(String[] args) {
        System.out.println(height(TreeNode.createTree()));
    }
}
