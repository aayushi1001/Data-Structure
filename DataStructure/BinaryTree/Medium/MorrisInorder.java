package DataStructure.BinaryTree.Medium;

import DataStructure.BinaryTree.utils.TreeNode;

import java.util.ArrayList;

public class MorrisInorder {
    static ArrayList<Integer> inorder(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        TreeNode curr = root;

        while (curr != null) {
            // If left is null, traverse right
            if (curr.left == null) {
                res.add(curr.val);
                curr = curr.right;
            }
            else {
                // Before traversing left, find IP
                TreeNode prev = curr.left;
                while (prev.right != null && prev.right != curr) {
                    prev = prev.right;
                }

                //create threads
                if (prev.right == null) {
                    prev.right = curr;
                    curr = curr.left;
                } else {
                    // If thread is present, remove thread
                    prev.right = null;
                    res.add(curr.val);
                    curr = curr.right;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
