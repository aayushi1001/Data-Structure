package DataStructure.BinaryTree.Medium;
import DataStructure.BinaryTree.utils.TreeNode;

import java.util.*;

public class ZigZagTraversal {
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean reverse = false;

        while(!queue.isEmpty()) {
            int len = queue.size();
            Integer[] nodes = new Integer[len];

            for(int i=0; i<len; ++i) {
                int index = reverse ? len - i - 1 : i;
                TreeNode curr = queue.poll();

                nodes[index] = curr.val;
                if(curr.left != null) {
                    queue.offer(curr.left);
                }

                if(curr.right != null) {
                    queue.offer(curr.right);
                }
            }

            result.add(Arrays.asList(nodes));
            reverse = !reverse;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(zigzagLevelOrder(TreeNode.createTree()));
    }
}
