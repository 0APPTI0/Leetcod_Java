package _145二叉树的后序遍历;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<Integer> result = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        loop(root);
        return result;
    }
    public void loop(TreeNode node){
        if (node == null) return;
        loop(node.left);
        loop(node.right);
        result.add(node.val);
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
