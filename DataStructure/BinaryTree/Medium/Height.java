package DataStructure.BinaryTree.Medium;

import DataStructure.BinaryTree.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Height {
    public static int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;

        while(!queue.isEmpty()) {
            int len = queue.size();
            for(int i=0; i<len; ++i) {
                TreeNode top = queue.poll();
                if(top.left != null) {
                    queue.offer(top.left);
                }

                if(top.right != null) {
                    queue.offer(top.right);
                }
            }
            level++;
        }

        return level;
    }

    public static void main(String[] args) {
        System.out.println(maxDepth(TreeNode.createTree()));
    }
}
