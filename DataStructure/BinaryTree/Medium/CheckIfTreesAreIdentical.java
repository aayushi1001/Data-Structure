package DataStructure.BinaryTree.Medium;

import DataStructure.BinaryTree.utils.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckIfTreesAreIdentical {

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
            return true;
        }

        if(p == null || q == null) {
            return false;
        }

        if(p.val != q.val) {
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        System.out.println(isSameTree(TreeNode.createTree(), TreeNode.createTree()));
    }
}
