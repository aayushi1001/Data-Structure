package DataStructure.BinaryTree;

import DataStructure.BinaryTree.utils.TreeNode;

import java.util.*;

public class RecursiveLevelOrder {

    public static void levelOrder(TreeNode root, int level, ArrayList<ArrayList<Integer>> res) {
        if (root == null)
            return;

        if (res.size() <= level)
            res.add(new ArrayList<>());

        res.get(level).add(root.val);

        levelOrder(root.left, level + 1, res);
        levelOrder(root.right, level + 1, res);
    }

    public static void main(String[] args) {
    }
}
