package DataStructure.BinaryTree;

import DataStructure.BinaryTree.utils.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class IterativeLevelOrder {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) {
            return ans;
        }
        int level = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            int len = queue.size();

            for(int i=0; i<len; ++i) {
                if(ans.size() <= level) {
                    ans.add(new ArrayList<>());
                }

                TreeNode curr = queue.poll();
                ans.get(level).add(curr.val);

                if(curr.left != null) {
                    queue.offer(curr.left);
                }

                if(curr.right != null) {
                    queue.offer(curr.right);
                }
            }

            ++level;
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(levelOrder(TreeNode.createTree()));
    }
}
