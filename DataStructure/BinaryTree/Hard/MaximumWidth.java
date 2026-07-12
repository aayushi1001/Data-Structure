package DataStructure.BinaryTree.Hard;

import DataStructure.BinaryTree.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumWidth {
    static class NodePosition {
        TreeNode node;
        int position;

        NodePosition(TreeNode node, int position) {
            this.node = node;
            this.position = position;
        }
    }

    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;

        Queue<NodePosition> queue = new LinkedList<>();
        queue.offer(new NodePosition(root, 0));
        int maxWidth = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();
            int leftmost = 0, rightmost = 0;

            for (int i = 0; i < size; i++) {
                NodePosition current = queue.poll();
                TreeNode node = current.node;
                int pos = current.position;

                if (i == 0) leftmost = pos;
                if (i == size - 1) rightmost = pos;

                if (node.left != null) {
                    queue.offer(new NodePosition(node.left, pos * 2));
                }
                if (node.right != null) {
                    queue.offer(new NodePosition(node.right, pos * 2 + 1));
                }
            }

            maxWidth = Math.max(maxWidth, rightmost - leftmost + 1);
        }

        return maxWidth;
    }

    public static void main(String[] args) {

    }
}
