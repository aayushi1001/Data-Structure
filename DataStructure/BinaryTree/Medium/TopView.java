package DataStructure.BinaryTree.Medium;

import DataStructure.BinaryTree.utils.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class TopView {
    static class Pair {
        TreeNode node;
        int col;

        Pair(TreeNode node, int col) {
            this.node = node;
            this.col = col;
        }
    }

    // Using BFS
    public static ArrayList<Integer> topView(TreeNode root) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(root, 0));
        ArrayList<Integer> ans = new ArrayList<>();

        while(!queue.isEmpty()) {
            int len = queue.size();

            for(int i=0; i<len; ++i) {
                Pair node = queue.poll();
                if(!map.containsKey(node.col)) {
                    map.put(node.col, node.node.val);
                }

                if(node.node.left != null) {
                    queue.offer(new Pair(node.node.left, node.col -1));
                }

                if(node.node.right != null) {
                    queue.offer(new Pair(node.node.right, node.col +1));
                }
            }
        }

        map.forEach((col, data) -> {
            ans.add(data);
        });

        return ans;

    }

    public static void main(String[] args) {
        System.out.println(topView(TreeNode.createTree()));
    }
}
