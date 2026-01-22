package DataStructure.BinaryTree.Medium;

public class VerticalOrderTraversal {
//    public static void levelOrder(TreeNode root, int h, int v, Map<Integer, ArrayList<Integer>> map) {
//        if (root == null)
//            return;
//
//        ArrayList<Integer> arr = map.getOrDefault(v, new ArrayList<>());
//        arr.add(root.val);
//        map.put(v, arr);
//
//        levelOrder(root.left, h + 1, v - 1, map);
//        levelOrder(root.right, h + 1, v + 1, map);
//    }
//
//    public List<List<Integer>> verticalTraversal(TreeNode root) {
//        List<List<Integer>> ans = new ArrayList<>();
//        Map<Integer, ArrayList<Integer>> map = new TreeMap<>();
//        levelOrder(root, 0, 0, map);
//        map.forEach((data, arr) -> {
//            System.out.println(data);
//            ans.add(arr);
//        });
//
//        return ans;
//    }

}
