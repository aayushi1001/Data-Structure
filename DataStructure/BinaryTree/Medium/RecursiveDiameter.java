package DataStructure.BinaryTree.Medium;

import DataStructure.BinaryTree.utils.TreeNode;
import DataStructure.StacksAndQueues.utils.Pair;

public class RecursiveDiameter {
    private Pair<Integer, Integer> diameterUtil(TreeNode root) {
        if (root == null) {
            return new Pair<>(0, 0);
        }

        Pair<Integer, Integer> left = diameterUtil(root.left);
        Pair<Integer, Integer> right = diameterUtil(root.right);

        int height = 1 + Math.max(left.getFirst(), right.getFirst());

        int currDiameter = left.getFirst() + right.getFirst();

        int diameter = Math.max(
                currDiameter,
                Math.max(left.getSecond(), right.getSecond())
        );

        return new Pair<>(height, diameter);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        return diameterUtil(root).getSecond();
    }

    public static void main(String[] args) {

    }
}
