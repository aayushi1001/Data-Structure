package DataStructure.BinaryTree.Medium;

import DataStructure.BinaryTree.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {
    public static boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            int l = 0, h = queue.size() -1;
            int[] levelNodes = new int[h+1];

            for(int i=0; i<=h; ++i) {
                TreeNode curr = queue.poll();
                if(curr != null) {
                    levelNodes[i] = curr.val;
                    queue.offer(curr.left);
                    queue.offer(curr.right);
                } else {
                    levelNodes[i] = Integer.MIN_VALUE;
                }
            }

            while(l < h) {
                if(levelNodes[l] != levelNodes[h]) {
                    return false;
                }

                ++l;
                --h;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isSymmetric(TreeNode.createTree()));
    }
}
