package DataStructure.BinaryTree.Hard;

import DataStructure.BinaryTree.IterativeLevelOrder;
import DataStructure.BinaryTree.utils.TreeNode;

public class ChildrenSum {

    public static void childrenSum(TreeNode root) {
        if(root == null) {
            return;
        }

        int childSum = 0;
        if(root.left != null) {
            childSum += root.left.val;
        }

        if(root.right != null) {
            childSum += root.right.val;
        }

        if(childSum < root.val) {
            if(root.left != null) {
                root.left.val = root.val;;
            } else if(root.right != null) {
                root.right.val = root.val;
            }
        }

        childrenSum(root.left);
        childrenSum(root.right);

        int sum = 0;
        if(root.left != null) {
            sum += root.left.val;
        }

        if(root.right != null) {
            sum += root.right.val;
        }

        if(sum > root.val) {
            root.val = sum;
        }
    }

    public static void main(String[] args) {
        TreeNode root = TreeNode.createTree();
        childrenSum(root);
        IterativeLevelOrder.levelOrder(root);
    }
}
